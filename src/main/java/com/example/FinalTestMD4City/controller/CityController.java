package com.example.FinalTestMD4City.controller;

import com.example.FinalTestMD4City.model.City;
import com.example.FinalTestMD4City.model.Country;
import com.example.FinalTestMD4City.service.ICityService;
import com.example.FinalTestMD4City.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/cities")
public class CityController {

    @Autowired
    ICityService cityService;

    @Autowired
    ICountryService countryService;


    @ModelAttribute("city")
    public City city(){
        return new City();
    }

    @ModelAttribute("countries")
    public List<Country> getCountries(){
        return countryService.findAll();
    }

    @GetMapping("/showAll")
    public ModelAndView showAll (){
        ModelAndView modelAndView = new ModelAndView("showAll");
        modelAndView.addObject("countries", countryService.findAll());
        modelAndView.addObject("cities", cityService.findAll());
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView createForm() {
        return new ModelAndView("/create");
    }

    @PostMapping("/create")
    public String create(@ModelAttribute City city) {
        cityService.save(city);
        return "redirect:/cities/showAll";
    }

    @GetMapping("{id}/edit")
    public ModelAndView edit(@PathVariable Long id){
        Optional<City> city = cityService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/edit");
        modelAndView.addObject("city", city);
        return modelAndView;
    }

    @PostMapping("/update")
    public String update(@ModelAttribute City city){
        cityService.save(city);
        return "redirect:/cities/showAll";
    }

    @GetMapping("{id}/delete")
    public ModelAndView deleteForm(@PathVariable Long id){
        Optional<City> city = cityService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/delete");
        modelAndView.addObject("city", city);
        return modelAndView;
    }
    @PostMapping("/delete")
    public String delete(@RequestParam Long id){
        cityService.deleteById(id);
        return "redirect:/cities/showAll";
    }

    @GetMapping("{id}/view")
    public ModelAndView getCityDetail(@PathVariable Long id){
        ModelAndView modelAndView = new ModelAndView("/view");
        Optional<City> city = cityService.findById(id);
        modelAndView.addObject("city", city);
        return modelAndView;
    }

}
