package com.example.prometeustest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    @GetMapping("/ok")
    public String getOk() throws InterruptedException {
        Thread.sleep(getRandomNumber(100, 1000));
        return "ok";
    }

    @GetMapping("/ok2")
    public int getRandInt() throws InterruptedException {
        Thread.sleep(getRandomNumber(100, 1000));
        return getRandomNumber(100, 1000);
    }
}
