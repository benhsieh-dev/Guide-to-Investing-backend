package com.portfolio.investments.service;

import com.portfolio.investments.model.Investor;
import com.portfolio.investments.repository.InvestorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestorServiceImpl implements InvestorService {

    @Autowired
    private InvestorRepository investorRepository;

    @Override
    public Investor saveInvestor(Investor investor) {
        return investorRepository.save(investor);
    }

    @Override
    public List<Investor> getAllInvestors() {
        return investorRepository.findAll();
    }
}
