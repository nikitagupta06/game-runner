package com.practice.spring.game_runner.enterprise.example.web;

import com.practice.spring.game_runner.enterprise.example.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyWebController {
//    @Autowired
    private BusinessService businessService;

    public MyWebController(BusinessService businessService) {
        System.out.println("Controller Constructor Injection");
        this.businessService = businessService;
    }

    public long returnValueFromBusinessService() {
        return businessService.calculateSum();
    }
}


