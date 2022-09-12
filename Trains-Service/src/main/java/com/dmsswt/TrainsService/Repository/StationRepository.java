package com.dmsswt.TrainsService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dmsswt.TrainsService.model.StationDetails;

@Repository 
public interface StationRepository extends JpaRepository<StationDetails, Integer> {

}
