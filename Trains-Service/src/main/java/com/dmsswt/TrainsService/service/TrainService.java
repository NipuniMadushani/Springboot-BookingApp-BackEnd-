package com.dmsswt.TrainsService.service;

import java.util.List;
import java.util.Optional;

import com.dmsswt.TrainsService.model.Train;

public interface TrainService {

	void saveTrain(Train trainid);

	Optional<Train> findById(Integer trainid);

	void deleteById(Integer trainid);

	List<Train> findAll();

}
