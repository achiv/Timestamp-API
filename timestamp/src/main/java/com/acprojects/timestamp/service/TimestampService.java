package com.acprojects.timestamp.service;

import com.acprojects.timestamp.model.Timestamp;

public interface TimestampService {

    public Timestamp getCurrentDate();

    public Timestamp getDate(String date) throws Exception;
    
}
