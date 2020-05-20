package com.norman.primetown.controller;

import com.norman.primetown.model.House;
import com.norman.primetown.service.HouseService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping ("/house")
    public House insertHouse(@RequestBody House house){
        return houseService.insertHouse(house);
    }

    @PutMapping ("/house/{id}")
    public House updateHouse(@PathVariable Long id, @RequestBody House house){
        return houseService.updateHouse(id,house);
    }
}
