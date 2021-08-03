package com.portfolio.investments.service;

import com.portfolio.investments.model.Investor;

import java.util.List;

public interface InvestorService {
    public Investor saveInvestor(Investor investor);
    public List<Investor> getAllInvestors();
}
