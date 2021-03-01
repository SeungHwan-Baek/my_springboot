package com.keeper100.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @SpringBootApplication 스프링부트 자동설정 처리, 해당 위치부터 읽어 들이기 때문에 항상 프로젝트 최 상단위치 필요
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);     // 내장 WAS 실행
    }
}
