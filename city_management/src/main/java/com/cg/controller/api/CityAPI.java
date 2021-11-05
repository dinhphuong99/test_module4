package com.cg.controller.api;


import com.cg.model.City;
import com.cg.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/cities")
public class CityAPI {

    @Autowired
    private CityService cityService;

    @GetMapping
    public List<City> getList() {
        return cityService.findAll();
    }

    @GetMapping("/{id}")
    public City update(@PathVariable Long id) {
        return cityService.findById(id).get();
    }

    @PostMapping("/create")
    public City create(@RequestBody City city) {
        return cityService.save(city);
    }

    @PostMapping("/update")
    public City update(@RequestBody City city) {
        return cityService.save(city);
    }
}

