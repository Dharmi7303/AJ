package org.example.springtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringtestApplication.class, args);
    }

    @GetMapping("/greetings")

    public String greetings() {
        return "Hello World!";
    }

}
