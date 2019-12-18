package com.luoxinxin.servicefeign.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class SchedualServiceHistrix implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name){
        return "sorry"+name;
    }
}
