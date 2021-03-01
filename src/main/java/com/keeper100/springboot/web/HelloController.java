package com.keeper100.springboot.web;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    // Get 요청 API, /hello 요청이 오면 hello 문자열 반환
    public String hello() {
        return "hello";
    }
}
