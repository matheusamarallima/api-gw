package com.matheus.apigateway.LogginFilter;

import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.logging.Logger;

public class LogginFilter implements GlobalFilter {

    private Logger logger = (Logger) LoggerFactory.getLogger(LogginFilter.class);
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//        logger.info("Original request path - > {}");
        return chain.filter(exchange);
    }
}
