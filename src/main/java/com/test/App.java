package com.test;

import org.apache.log4j.Logger;
import org.apache.log4j.MDC;

import java.util.UUID;

public class App {
    final static Logger logger = Logger.getLogger(App.class);
    public static void main(String[] args) {
        String sparklineOcid= UUID.randomUUID().toString();
        MDC.put("sparklineOcid", sparklineOcid);
        logger.info("Hello World");
        logger.error("This is error", new RuntimeException("Custom Error"));
    }
}