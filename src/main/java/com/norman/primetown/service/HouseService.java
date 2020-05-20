package com.norman.primetown.service;

import com.norman.primetown.exception.HouseIdNotFoundException;
import com.norman.primetown.model.House;
import com.norman.primetown.repo.HouseRepo;
import org.springframework.stereotype.Service;

@Service
public class HouseService {
    private final HouseRepo houseRepo;

    public HouseService(HouseRepo houseRepo) {
        this.houseRepo = houseRepo;
    }

    public House getHouse(Long id) {
        return houseRepo.findById(id).orElseThrow(HouseIdNotFoundException::new);
    }

    public House insertHouse(House house) {
        return houseRepo.save(house);
    }
}
