package com.itspace.develop;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class DeepThoughtCaller {

  @HystrixCommand(fallbackMethod = "fallback")
  public Integer convert(int hours) {
    return restTemplate.getForObject("http://deep-thought/convert/" + hours,
      Integer.class);

  }

  public Integer fallback(int hours) {
    return 42;
  }

  @Autowired
  private RestTemplate restTemplate;

  @Bean
  @LoadBalanced
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }
}
