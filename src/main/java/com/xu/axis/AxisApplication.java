package com.xu.axis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xu.axis.dao")
public class AxisApplication {

  public static void main(String[] args) {
    SpringApplication.run(AxisApplication.class, args);
  }
}

