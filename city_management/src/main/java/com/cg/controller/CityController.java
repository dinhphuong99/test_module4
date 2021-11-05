package com.cg.controller;

import com.cg.model.City;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/cities")
public class CityController {
    @GetMapping
    public ModelAndView getList() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/city/list");

        City city = new City();
        return modelAndView;
    }
}
