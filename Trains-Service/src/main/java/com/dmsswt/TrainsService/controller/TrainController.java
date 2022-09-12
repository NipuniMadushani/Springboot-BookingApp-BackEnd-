package com.dmsswt.TrainsService.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmsswt.TrainsService.model.StationDetails;
import com.dmsswt.TrainsService.model.Train;
import com.dmsswt.TrainsService.service.StationService;
import com.dmsswt.TrainsService.service.TrainService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/trains")
public class TrainController {
	
	@Autowired
	private TrainService trainService;
	
	@Autowired
	private StationService stationService;
	
	@PostMapping("/train")
	public String saveTrain(@RequestBody Train train) {
	trainService.saveTrain(train);
	return "Added train with id :  " + train.getTrainId();
	}
	
	@GetMapping("{trainid}")
	public Optional<Train> getTrain(@PathVariable Integer trainid){
		return trainService.findById(trainid);
	}
	
	
	@DeleteMapping("/{trainid}")
	public String deleteTrain (@PathVariable Integer trainid) {
		trainService.deleteById(trainid);
		return "Train deleted with id : "+trainid;
    }
	
	@PutMapping("/{trainid}")
	public Train updateTrain(@PathVariable("trainid") Integer trainid,@RequestBody Train t ) {
		t.setTrainId(trainid);
		trainService.saveTrain(t);
		return t;
		
}
	
	 @GetMapping("/trains")
	    public List<Train> getTrains(){
		return trainService.findAll();
		
	}
	    @GetMapping("/allTrains/{trainid}")
	    public Optional<Train> getTrains(@PathVariable Integer trainid){
		return trainService.findById(trainid);
	}
	    
	    @GetMapping("/allStations")
	    public List<StationDetails> getStations(){
		return stationService.findAllStations();
		
	}

}
