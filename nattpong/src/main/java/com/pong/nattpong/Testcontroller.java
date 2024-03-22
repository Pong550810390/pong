package com.pong.nattpong;

import java.util.HashMap;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Testcontroller {
    @RequestMapping("/getData")
    @CrossOrigin(origins = "*")
    public @ResponseBody HashMap<String,Object> getData(){
        HashMap<String,Object> data = new HashMap<String,Object>();
        data.put("firstName","nattapong");
        data.put("lastName","saethao");
        data.put("id","64143172");
        return data;
    }
}
