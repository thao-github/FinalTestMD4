package com.example.FinalTestMD4City.service;

import com.example.FinalTestMD4City.model.Country;
import com.example.FinalTestMD4City.repository.ICountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements ICountryService{
    @Autowired
    ICountryRepo countryRepo;

    @Override
    public List<Country> findAll() {
        return (List<Country>) countryRepo.findAll();
    }
}
