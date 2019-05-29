package com.susu.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class SusuController {

    @Value("${su}")
    private String su;

    @RequestMapping("/hey")
    public String hey() {
        log.info("susu");
        return "Hey, Susu";
    }

    @RequestMapping("/conf")
    public String suValue() {
        return su;
    }

}
