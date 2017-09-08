package io.davis;

import io.davis.application.UserApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

/**
 * Created by rai on 2017/9/8.
 */
@SpringBootApplication
public class Application {

  @Autowired
  private transient UserApplication userApplication;

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @PostConstruct
  private void createUser() {
    userApplication.create();
  }
}
