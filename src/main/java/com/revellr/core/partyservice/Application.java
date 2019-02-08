package com.revellr.core.partyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@ComponentScan("com.revellr")
@EntityScan(basePackages = {"com.revellr.core"})
@EnableAutoConfiguration
public class Application {

  public static void main(final String[] args) throws Exception {
    SpringApplication.run(Application.class, args);
  }
}
