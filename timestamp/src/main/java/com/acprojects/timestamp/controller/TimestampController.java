package com.acprojects.timestamp.controller;

import com.acprojects.timestamp.model.Timestamp;
import com.acprojects.timestamp.service.TimestampService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimestampController {

    @Autowired
    private TimestampService timestampService;

    @GetMapping("/api")
    public Timestamp fetchCurrentDate() throws Exception{
        return timestampService.getCurrentDate();
    }

    @GetMapping("/api/{dateString}")
    public Timestamp fetchDate(@PathVariable("dateString") String date) throws Exception{
        return timestampService.getDate(date);
    }
    
}
