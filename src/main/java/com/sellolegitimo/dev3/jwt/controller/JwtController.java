package com.sellolegitimo.dev3.jwt.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sellolegitimo.dev3.jwt.service.JwtService;

@RestController
@RequestMapping("/api/v1/jwt")
@CrossOrigin(origins = "*")
public class JwtController {

    private final JwtService jwtService;

    public JwtController(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    @PostMapping("/generate")
    public Map<String, String> generate(@RequestBody Map<String, String> body) {

        String cedula = body.get("cedula");

        String token = jwtService.generateToken(cedula);

        return Map.of("token", token);
    }
}