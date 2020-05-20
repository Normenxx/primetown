package com.norman.primetown.service;

import com.norman.primetown.business.HouseBusiness;
import com.norman.primetown.exception.HouseIdNotFoundException;
import com.norman.primetown.exception.HouseNumberWrongException;
import com.norman.primetown.exception.HouseYearWrongException;
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
        HouseBusiness houseBusiness = new HouseBusiness();

        if(houseBusiness.checkYearOfConstruction(house.getYearOfConstruction())){
            if(houseBusiness.checkPrimenumber(house.getNumber())){
                return houseRepo.save(house);
            }else {
                throw new HouseNumberWrongException();
            }
        } else{
            throw new HouseYearWrongException();
        }
    }

    public House updateHouse(Long id, House house) {
        HouseBusiness houseBusiness = new HouseBusiness();

        if(houseBusiness.checkYearOfConstruction(house.getYearOfConstruction())){
            if(houseBusiness.checkPrimenumber(house.getNumber())){
                if(houseRepo.findById(id).isPresent()){
                    house.setId(id);
                    return houseRepo.save(house);
                }else{
                    throw new HouseIdNotFoundException();
                }
            }else {
                throw new HouseNumberWrongException();
            }
        } else{
            throw new HouseYearWrongException();
        }
    }

    public void deleteHouse(Long id) {
        House house = this.getHouse(id);
        houseRepo.delete(house);
    }
}
