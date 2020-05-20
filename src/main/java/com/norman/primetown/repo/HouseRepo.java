package com.norman.primetown.repo;

import com.norman.primetown.model.House;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepo extends JpaRepository<House,Long> {
}
