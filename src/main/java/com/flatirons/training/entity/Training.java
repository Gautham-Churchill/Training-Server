package com.flatirons.training.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "training")
public class Training {

	@Id
	@Column(name = "training_id")
	public String trainingId;

	@Column(name = "training_name")
	public String trainingName;

	@Column(name = "mode_of_training")
	public String modeOfTraining;

	@Column(name = "trainer_name")
	public String trainerName;
	
	@Column(name = "status")
	public String status;
	
	@Column(name = "duration")
	public String duration;

	public String getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(String trainingId) {
		this.trainingId = trainingId;
	}

	public String getTrainingName() {
		return trainingName;
	}

	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}

	public String getModeOfTraining() {
		return modeOfTraining;
	}

	public void setModeOfTraining(String modeOfTraining) {
		this.modeOfTraining = modeOfTraining;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	/*public Training(String trainingId, String trainingName, String modeOfTraining,String trainerName) {
		super();
		this.trainingId = trainingId;
		this.trainingName = trainingName;
		this.modeOfTraining = modeOfTraining;
		this.trainerName = trainerName;
	}*/
}
