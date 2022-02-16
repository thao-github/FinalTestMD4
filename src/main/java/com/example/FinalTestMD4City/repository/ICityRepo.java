package com.example.FinalTestMD4City.repository;

import com.example.FinalTestMD4City.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICityRepo extends CrudRepository<City, Long> {
}
