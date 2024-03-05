package org.example.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  private final String MSG = "Hello version5";

  @GetMapping("/hello")
  public String hello() {
    return MSG;
  }

}
