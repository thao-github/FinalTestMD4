package com.example.FinalTestMD4City.repository;

import com.example.FinalTestMD4City.model.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICountryRepo extends CrudRepository<Country, Long> {
}
