package com.example.calculator.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private  CalculatorService calculatorService = new CalculatorService();


    @Test
    public  void testSum(){
        assertEquals(5, calculatorService.sum(2,3));
    }

}