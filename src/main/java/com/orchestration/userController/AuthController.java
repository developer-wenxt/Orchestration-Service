package com.orchestration.userController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orchestration.req.LoginRequest;
import com.orchestration.response.CommonLoginRes;
import com.orchestration.routingService.AuthClient;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/authentication")
public class AuthController {

	private final AuthClient authClient;

	@PostMapping("/login")
	ResponseEntity<CommonLoginRes> getloginToken(@RequestBody LoginRequest mslogin, HttpServletRequest http) {
		 String authorization = http.getHeader("Authorization");
		return authClient.getloginToken(mslogin, authorization);
	}

}
