package com.CafeMini.Shop.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ServerController {
    @GetMapping()
    public  String Server(){
        return "Welcome To CAFEMINI";

    }


}
