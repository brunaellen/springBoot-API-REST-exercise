package br.com.alura.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.controller.dto.LoginFormDto;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {
  
  @PostMapping
  public ResponseEntity<?> authenticate(@RequestBody @Valid LoginFormDto form) {
    return null;
  }
}
