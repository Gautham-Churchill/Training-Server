package com.flatirons.training;

import org.springframework.data.repository.CrudRepository;

import com.flatirons.training.entity.Training;

public interface TrainingRepository extends CrudRepository<Training, String>{

}
