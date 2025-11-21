package com.patterns.singletone;

import java.util.Date;
import java.util.Timer;

public class Logger {
    private static Logger instance;

    private Logger()
    {}

    public static synchronized Logger getInstance(){
        if(instance == null) {
            instance= new Logger();
        }
        return instance;
    }

    public void log(String messgae) {
        System.out.println("timestamp "+new Date()+"-"+messgae);
    }
}
