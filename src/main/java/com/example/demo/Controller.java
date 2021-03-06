package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Controller {


    private final ServiceImpl serviceImpl;

    public Controller(ServiceImpl serviceImpl) {
        this.serviceImpl = serviceImpl;
    }



    @RequestMapping("/")
    public String index() {
        return "Start empty page";
    }




    @RequestMapping("/connect")
    public String connect() {
        return serviceImpl.connect();
    }

    @RequestMapping("/allUserNames")
    public String getAllUserNames(){
        return serviceImpl.getAllUserNames();
    }

}