package com.chenxi.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by chenxi on 2017/8/24.
 * <p>
 * http://upload-images.jianshu.io/upload_images/2279594-6b7c148110ebc56e.png
 *
 * @author chenxi
 */
@SpringBootApplication
@EnableZuulProxy
public class ServiceZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceZuulApplication.class, args);
    }
}
