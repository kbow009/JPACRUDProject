package com.skilldistillery.jpacrud.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Dog {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String breed;
	
	@Column(name="breed_group")
	private String breedGroup;
	
	private String height;
	private String weight;
	
	@Column(name="average_life_span")
	private int avgLifeSpan;
	
	@Column(name="friendliness_scale")
	private int friendlyScale;
	
	@Column(name="health_and_grooming_maintenance")
	private int healthAndGrooming;
	
	@Column(name="trainability_scale")
	private int trainabilityScale;
	
	@Column(name="exercise_needs_scale")
	private int exerciseNeedsScale;
	
	@Column(name="more_info")
	private String moreInfo;
	
	

	public Dog() {
		super();
	}
	@Override
	public String toString() {
		return "Dog [id=" + id + ", breed=" + breed + ", breedGroup=" + breedGroup + ", height=" + height + ", weight="
				+ weight + ", avgLifeSpan=" + avgLifeSpan + ", friendlyScale=" + friendlyScale + ", healthAndGrooming="
				+ healthAndGrooming + ", trainabilityScale=" + trainabilityScale + ", exerciseNeedsScale="
				+ exerciseNeedsScale + ", moreInfo=" + moreInfo + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getBreedGroup() {
		return breedGroup;
	}
	public void setBreedGroup(String breedGroup) {
		this.breedGroup = breedGroup;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public int getAvgLifeSpan() {
		return avgLifeSpan;
	}
	public void setAvgLifeSpan(int avgLifeSpan) {
		this.avgLifeSpan = avgLifeSpan;
	}
	public int getFriendlyScale() {
		return friendlyScale;
	}
	public void setFriendlyScale(int friendlyScale) {
		this.friendlyScale = friendlyScale;
	}
	public int getHealthAndGrooming() {
		return healthAndGrooming;
	}
	public void setHealthAndGrooming(int healthAndGrooming) {
		this.healthAndGrooming = healthAndGrooming;
	}
	public int getTrainabilityScale() {
		return trainabilityScale;
	}
	public void setTrainabilityScale(int trainabilityScale) {
		this.trainabilityScale = trainabilityScale;
	}
	public int getExerciseNeedsScale() {
		return exerciseNeedsScale;
	}
	public void setExerciseNeedsScale(int exerciseNeedsScale) {
		this.exerciseNeedsScale = exerciseNeedsScale;
	}
	public String getMoreInfo() {
		return moreInfo;
	}
	public void setMoreInfo(String moreInfo) {
		this.moreInfo = moreInfo;
	}


}
