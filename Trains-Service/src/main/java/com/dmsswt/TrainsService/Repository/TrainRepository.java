package com.dmsswt.TrainsService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dmsswt.TrainsService.model.Train;

@Repository
public interface TrainRepository extends JpaRepository<Train, Integer> {

}
