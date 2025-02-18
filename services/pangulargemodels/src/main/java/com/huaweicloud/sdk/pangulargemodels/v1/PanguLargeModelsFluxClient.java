package com.huaweicloud.sdk.pangulargemodels.v1;

import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.pangulargemodels.v1.model.ChatCompletionReq;
import com.huaweicloud.sdk.pangulargemodels.v1.model.TextCompletionReq;

import reactor.core.publisher.Flux;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.reactive.ClientHttpRequest;
import org.springframework.http.codec.ServerSentEvent;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientRequestException;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.function.Consumer;

public class PanguLargeModelsFluxClient {
    private String panguEndpoint;

    private String projectId;

    private String deploymentId;

    private Consumer<HttpHeaders> headersConsumer;

    private static final String TEXT_COMPLETION_URL = "v1/%s/deployments/%s/text/completions";

    private static final String CHAT_COMPLETION_URL = "v1/%s/deployments/%s/chat/completions";

    public PanguLargeModelsFluxClient(String panguEndpoint, String projectId, String deploymentId,
        Consumer<HttpHeaders> headersConsumer) {
        this.panguEndpoint = panguEndpoint;
        this.projectId = projectId;
        this.deploymentId = deploymentId;
        this.headersConsumer = headersConsumer;
    }

    public Flux<ServerSentEvent<String>> executeTextCompletion(TextCompletionReq request) {
        String url = String.format(TEXT_COMPLETION_URL, projectId, deploymentId);
        return this.remoteFluxStream(url, headersConsumer, request);
    }

    public Flux<ServerSentEvent<String>> executeChatCompletion(ChatCompletionReq request) {
        String url = String.format(CHAT_COMPLETION_URL, projectId, deploymentId);
        return this.remoteFluxStream(url, headersConsumer, request);
    }

    public Flux<ServerSentEvent<String>> remoteFluxStream(String url, Consumer<HttpHeaders> headersConsumer,
        Object obj) {
        BodyInserter<?, ? super ClientHttpRequest> bodyInserter = BodyInserters.fromValue(obj);
        ParameterizedTypeReference<ServerSentEvent<String>> type
            = new ParameterizedTypeReference<ServerSentEvent<String>>() { };
        WebClient webClient = getWebClient();
        WebClient.RequestBodyUriSpec post = webClient.post();
        WebClient.RequestBodySpec uri = post.uri(url);
        WebClient.RequestBodySpec headers = uri.headers(headersConsumer);
        WebClient.RequestHeadersSpec<?> body = headers.body(bodyInserter);
        WebClient.RequestHeadersSpec<?> accept = body.accept(MediaType.TEXT_EVENT_STREAM);
        WebClient.ResponseSpec retrieve = accept.retrieve();
        return retrieve.bodyToFlux(type).doOnError(
            WebClientRequestException.class, err -> {
                throw new SdkException(err.getMessage(), err);
            })
            .doOnError(WebClientResponseException.class, err -> {
                throw new SdkException(err.getResponseBodyAsString(),  err);
            });
    }

    private WebClient getWebClient() {
        WebClient webClient = null;
        try {
            webClient = SseUtils.getWebClient(this.panguEndpoint);
        } catch (NoSuchAlgorithmException | KeyManagementException e) {
            throw new SdkException("Init webclient error.");
        }

        return webClient;
    }
}
