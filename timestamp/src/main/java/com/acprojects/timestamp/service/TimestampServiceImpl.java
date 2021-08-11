package com.acprojects.timestamp.service;

import com.acprojects.timestamp.model.Timestamp;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;  

@Service
public class TimestampServiceImpl implements TimestampService {

    @Override
    public Timestamp getCurrentDate() {
        Date time = new Date();
        Long unixCheck = System.currentTimeMillis();
        SimpleDateFormat formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");  
        formatter.setTimeZone(TimeZone.getTimeZone("GMT"));
        String utcCheck = formatter.format(time); 

        return new Timestamp(unixCheck, utcCheck);

    }

    @Override
    public Timestamp getDate(String date) throws Exception {

        Long unixCheck = null;
        String utcCheck = "";
        
        if(!date.contains("-")){
            unixCheck = Long.parseLong(date);
            Date time = new Date(unixCheck);
            SimpleDateFormat formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");  
            formatter.setTimeZone(TimeZone.getTimeZone("GMT"));
            utcCheck = formatter.format(time);  
        }
        else{
            utcCheck = date;
            Date time = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            formatter.setTimeZone(TimeZone.getTimeZone("GMT"));
            time = formatter.parse(utcCheck);
            unixCheck = time.getTime();

            SimpleDateFormat formatter2 = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");  
            formatter2.setTimeZone(TimeZone.getTimeZone("GMT"));
            utcCheck = formatter2.format(time); 
        }

        return new Timestamp(unixCheck, utcCheck);
    }

}
