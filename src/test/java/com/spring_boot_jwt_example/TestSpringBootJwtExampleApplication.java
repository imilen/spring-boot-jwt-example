package com.spring_boot_jwt_example;

import org.springframework.boot.SpringApplication;

public class TestSpringBootJwtExampleApplication {

  public static void main(String[] args) {
    SpringApplication.from(SpringBootJwtExampleApplication::main)
        // .with(TestcontainersConfiguration.class)
        .run(args);
  }
}
