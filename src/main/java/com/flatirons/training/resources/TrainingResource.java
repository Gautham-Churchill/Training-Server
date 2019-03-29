package com.flatirons.training.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.flatirons.training.entity.Training;
import com.flatirons.training.services.TrainingServices;

@CrossOrigin
@RestController
public class TrainingResource {
	
	@Autowired
	TrainingServices trainingServices;
	
	@RequestMapping(value = "/training", method = RequestMethod.GET)
	public List<Training> getAllTraining() {
		return trainingServices.getTrainingList();
	}
	
	@RequestMapping(value = "/addTraining", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
	public @ResponseBody void addTraining(@RequestBody(required= true) Training training) {
		trainingServices.addTraining(training);
	}
	
	@RequestMapping(value = "/deleteTraining", method = RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.OK)
	public @ResponseBody void deleteTraining(@RequestBody(required= true) String trainingId) {
		trainingServices.deleteTraining(trainingId);
	}
	
	@RequestMapping(value = "/editTraining", method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.OK)
	public @ResponseBody void editTraining(@RequestBody(required= true) Training training) {
		trainingServices.editTraining(training);
	}	
}
