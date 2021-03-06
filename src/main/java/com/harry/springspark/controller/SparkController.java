package com.harry.springspark.controller;

import com.harry.springspark.service.SparkTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class SparkController {

    @Autowired
    private SparkTestService sparkTestService;

    @RequestMapping("/demo/top10")
    public Map<String, Object> calculateTopTen() {
        return sparkTestService.calculateTopTen();
    }

    @RequestMapping("/demo/exercise")
    public void exercise() {
        sparkTestService.sparkExerciseDemo();
    }

    @RequestMapping("/demo/stream")
    public void streamingDemo() throws InterruptedException {
        sparkTestService.sparkStreaming();
    }

}
