package com.example.calculator.controller;

import com.example.calculator.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CalculatorController {

    final  CalculatorService calculatorService;

    @GetMapping("/sum")
    String sum(@RequestParam("a") Integer a, @RequestParam("b") Integer b){
        return  String.valueOf(calculatorService.sum(a,b));
    }
}
