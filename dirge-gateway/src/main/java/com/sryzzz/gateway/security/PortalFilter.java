package com.sryzzz.gateway.security;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * 网关过滤器，用来在请求头中添加当前服务名称
 *
 * @author sryzzz
 * @create 2022/9/12 17:56
 * @description 网关过滤器，用来在请求头中添加当前服务名称
 */
@Component
@Slf4j
@RequiredArgsConstructor
public class PortalFilter implements GlobalFilter, Ordered {

    @Value("${spring.application.name}")
    private String applicationName;

    @SneakyThrows
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest().mutate()
                .header("serviceName", applicationName)
                .build();
        exchange = exchange.mutate().request(request).build();
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return -1;
    }
}
