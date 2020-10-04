package com.example.tijolao.controller;

import com.example.tijolao.service.TijolaoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tijolao")
public class TijolaoController {

    @Autowired
    private TijolaoService service;

    @GetMapping
    public String getMessage(@RequestParam String key, @RequestParam Integer count) {
        return service.getMessage(key, count);
    }

}
