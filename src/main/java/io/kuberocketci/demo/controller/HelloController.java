package io.kuberocketci.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller for demo greetings.
 * Follows Spring Boot 3.x best practices with @RequestMapping at class level.
 */
@RestController
@RequestMapping("/api")
public class HelloController {

    /**
     * Returns a greeting message.
     *
     * @return greeting string
     */
    @GetMapping("/hello")
    public String hello() {
        return "Hello, KubeRocketCI!";
    }
}
