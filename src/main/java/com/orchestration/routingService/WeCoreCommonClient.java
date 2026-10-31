package com.orchestration.routingService;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = " WeCoreCommonApi")

public interface WeCoreCommonClient {

}
