package com.dmsswt.TrainsService.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmsswt.TrainsService.Repository.StationRepository;
import com.dmsswt.TrainsService.model.StationDetails;
import com.dmsswt.TrainsService.service.StationService;

@Service
public class StationServiceImpl implements StationService {
	
	@Autowired
	private StationRepository stationRepository;

	@Override
	public List<StationDetails> findAllStations() {
		return stationRepository.findAll();
	}

}
