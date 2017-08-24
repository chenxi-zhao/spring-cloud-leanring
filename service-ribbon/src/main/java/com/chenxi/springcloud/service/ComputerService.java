package com.chenxi.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by chenxi on 2017/8/24.
 *
 * @author chenxi
 */
@Service
public class ComputerService {
    private RestTemplate restTemplate;

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @HystrixCommand(fallbackMethod = "callError")
    public String add(Integer a, Integer b) {
        return restTemplate.getForEntity("http://COMPUTE-SERVICE/compute/add?a=" + a + "&b=" + b, String.class).getBody();
    }

    public String callError(Integer a, Integer b) {
        return "sorry, service error!";
    }
}
