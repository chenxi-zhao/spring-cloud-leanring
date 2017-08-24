package com.chenxi.springcloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by chenxi on 2017/8/24.
 *
 * @author chenxi
 */
@FeignClient(value = "compute-service")
//使用@FeignClient("compute-service")注解来绑定该接口对应compute-service服务
public interface ComputeService {
    @RequestMapping(value = "/compute/add", method = RequestMethod.GET)
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
