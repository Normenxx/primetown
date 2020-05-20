package com.norman.primetown.controller;

import com.norman.primetown.model.House;
import com.norman.primetown.service.HouseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HouseController {
    private final HouseService houseService;

    public HouseController(HouseService houseService) {
        this.houseService = houseService;
    }

    @GetMapping ("/house/{id}")
    public House getHouse(@PathVariable Long id){
        return houseService.getHouse(id);
    }
}
