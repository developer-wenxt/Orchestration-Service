package com.orchestration.routingService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.orchestration.req.LoginRequest;
import com.orchestration.response.CommonLoginRes;

@FeignClient(name = "AuthService")
public interface AuthClient {
    
    @PostMapping("/authentication/login")
    ResponseEntity<CommonLoginRes> getloginToken(@RequestBody LoginRequest mslogin, @RequestHeader(value = "Authorization", required = false) String authorization);
}
