package com.chenxi.springcloud.controller;

import com.chenxi.springcloud.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenxi on 2017/8/24.
 *
 * @author chenxi
 */
@RestController
@RequestMapping("/compute")
public class ConsumerController {
    private ComputerService computerService;

    @Autowired
    public void setComputerService(ComputerService computerService) {
        this.computerService = computerService;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(@RequestParam Integer a, @RequestParam Integer b) {
        return computerService.add(a, b);
    }
}
