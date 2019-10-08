package com.itspace.deepthought;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class DeepThoughtApplication implements DeepThought {

  public static void main(String[] args) {
    SpringApplication.run(DeepThoughtApplication.class, args);
  }

  @GetMapping("/convert/{hours}")
  @Override
  public Integer convert(@PathVariable("hours") int hours) {
    int storyPoints = convertFunction(hours);

    System.out.println(hours +" hours in story points would be " + storyPoints);
    System.out.println("\n");
    return storyPoints;
  }

  //region Conversion function
  private int convertFunction(int hours) {
    return hours * 2;
  }

}
