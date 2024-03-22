package com.pong.nattpong;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/api")

public class TestD {
    @RequestMapping("/getListData")
    @CrossOrigin(origins = "*")
    public List<HashMap<String,Object>> getListData(){
        List<HashMap<String,Object>> list =new ArrayList<HashMap<String,Object>>();
        HashMap<String,Object> data1 = new HashMap<String,Object>();
        data1.put("firstName","nattapong");
        data1.put("lastName","saethao");
        data1.put("id","64143172");
        list.add(data1);
        HashMap<String,Object> data2 = new HashMap<String,Object>();
        data2.put("firstName","nattapong111");
        data2.put("lastName","saethao112121");
        data2.put("id","64143175");
        list.add(data1);
        return list;
    }
}
