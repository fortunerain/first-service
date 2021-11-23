package com.example.firstservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first-service")
@Slf4j
public class FirstController {

  @GetMapping("/welcome")
  public String welcome() {
    return "first service.";
  }

  @GetMapping("/message")
  public String message(@RequestHeader("first-request") String header) {
    log.info(header);
    return "first service.";
  }

  @GetMapping("/check")
  public String check() {
    return "check. first service.";
  }

  @GetMapping("/")
  public String healthCheck() {
    return "ok";
  }
}
