package com.dmsswt.TrainsService.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmsswt.TrainsService.Repository.TrainRepository;
import com.dmsswt.TrainsService.model.Train;
import com.dmsswt.TrainsService.service.TrainService;

@Service
public class TrainServiceImpl implements TrainService {
	
	@Autowired
	private TrainRepository trainRepository;

	@Override
	public void saveTrain(Train train) {
		trainRepository.save(train);
		
	}

	@Override
	public Optional<Train> findById(Integer trainid) {
		return trainRepository.findById(trainid);
	}

	@Override
	public void deleteById(Integer trainid) {
		trainRepository.deleteById(trainid);
		
	}

	@Override
	public List<Train> findAll() {
		// TODO Auto-generated method stub
		return trainRepository.findAll();
	}

}
