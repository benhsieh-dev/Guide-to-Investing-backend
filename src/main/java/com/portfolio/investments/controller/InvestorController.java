package com.portfolio.investments.controller;

import com.portfolio.investments.model.Investor;
import com.portfolio.investments.service.InvestorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/getAll")
    public List<Investor> getAllInvestors() {
        return investorService.getAllInvestors();
    }
}
