package com.kodilla.spring.claculator;

import org.springframework.stereotype.Service;

@Service
public class Display {

    public double displayValue(double val) {
        System.out.println(val);
        return val;
    }
}