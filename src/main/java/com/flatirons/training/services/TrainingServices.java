package com.flatirons.training.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flatirons.training.TrainingRepository;
import com.flatirons.training.entity.Training;

@Service
public class TrainingServices {
	@Autowired
	private TrainingRepository trainingRepo;
	
	private final String FSIL = "FSIL_";

	public List<Training> getTrainingList() {
		List<Training> trainingList = new ArrayList<Training>();
		for (Training training : trainingRepo.findAll()) {
			trainingList.add(training);
		}
		return trainingList;
	}
	
	public void addTraining(Training training) {
		Long count = getTrainingListCount();
		training.setTrainingId(FSIL + (count+1));
		trainingRepo.save(training);
	}
	
	public void deleteTraining(String trainingId) {
		trainingRepo.deleteById(trainingId);
	}
	
	public void editTraining(Training training) {
		trainingRepo.save(training);
	}
	
	private long getTrainingListCount() {
		return trainingRepo.count();
	}

}
