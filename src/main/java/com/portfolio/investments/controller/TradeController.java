package com.portfolio.investments.controller;

import com.portfolio.investments.model.Order;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TradeController {

    @PostMapping("/trade")
    public String currentTrade(@RequestBody Order order) {
        return "Drools Configuration Test";
    }
}
