package com.acprojects.timestamp.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Timestamp {

    private Long unix;
    private String utc;
    
}
