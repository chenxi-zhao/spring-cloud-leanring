package com.chenxi.springcloud.controller;

import com.chenxi.springcloud.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenxi on 2017/8/24.
 *
 * @author chenxi
 */
@RestController
@RequestMapping("/compute")
public class ComputeController {
    private ComputeService computeService;

    @Autowired
    public void setComputeService(ComputeService computeService) {
        this.computeService = computeService;
    }

    @RequestMapping("/add")
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        return computeService.add(a, b);
    }
}
