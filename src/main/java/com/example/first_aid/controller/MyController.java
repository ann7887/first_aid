package com.example.first_aid.controller;

import com.example.first_aid.First_aidDatas;
import com.example.first_aid.model.First_aid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    @Autowired
    First_aidDatas datas;
    //data
    @GetMapping("/add")
    public @ResponseBody String add(@RequestParam String complect){
        First_aid first_aid = new First_aid(complect);
        datas.save(first_aid);
        return "Saved";
    }
    @GetMapping("/list")
    public @ResponseBody Iterable<First_aid> getAll(){
        return datas.findAll();
    }
}
