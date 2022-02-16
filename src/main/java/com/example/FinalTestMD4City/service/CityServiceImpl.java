package com.example.FinalTestMD4City.service;

import com.example.FinalTestMD4City.model.City;
import com.example.FinalTestMD4City.repository.ICityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityServiceImpl implements ICityService{
    @Autowired
    ICityRepo cityRepo;

    @Override
    public List<City> findAll() {
        return (List<City>) cityRepo.findAll();
    }

    @Override
    public void save(City city) {
        cityRepo.save(city);
    }

    @Override
    public Optional<City> findById(Long id) {
        return cityRepo.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        cityRepo.deleteById(id);
    }
}
