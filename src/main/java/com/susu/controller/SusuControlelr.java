package com.susu.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class SusuControlelr {

    @RequestMapping("/hey")
    public String hey() {
        log.info("susu");
        return "Hey, Susu";
    }
}
