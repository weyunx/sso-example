package com.example.auth.security;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class AuthUser {
        @GetMapping("/oauth/user")
        public Principal user(Principal principal) {
            return principal;
        }

}
