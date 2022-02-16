package com.example.FinalTestMD4City.service;

import com.example.FinalTestMD4City.model.City;

import java.util.List;
import java.util.Optional;

public interface ICityService {
    List<City> findAll();

    void save (City city);

    Optional<City> findById (Long id);

    void deleteById (Long id);
}
