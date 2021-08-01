package com.portfolio.investments.controller;

import com.portfolio.investments.model.Investor;
import com.portfolio.investments.service.InvestorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/investor")
public class InvestorController {
    @Autowired
    private InvestorService investorService;

    @PostMapping("/add")
    public String add(@RequestBody Investor investor) {
        investorService.saveInvestor(investor);
        return "New investor is added";
    }
}
