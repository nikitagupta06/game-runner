package com.practice.spring.game_runner.enterprise.example.business;

import com.practice.spring.game_runner.enterprise.example.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BusinessService {

    private DataService dataService;

    @Autowired
    public BusinessService(DataService dataService) {
        System.out.println("Constructor Injection");
        this.dataService = dataService;
    }


//    public void setDataService(DataService dataService) {
//        System.out.println("Setter Injection");
//        this.dataService = dataService;
//    }

    public long calculateSum(){
        List<Integer> data = dataService.getData();
        return data.stream().reduce(Integer::sum).get();
    }
}