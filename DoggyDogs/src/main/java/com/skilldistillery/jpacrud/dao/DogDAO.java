package com.skilldistillery.jpacrud.dao;

import java.util.List;

import com.skilldistillery.jpacrud.entities.Dog;

public interface DogDAO {
	Dog findById(int id);
	List<Dog> findAll();
public Dog addDog(Dog dog);
public Dog updateDog(int id, Dog dog);
public boolean deleteDog(int id);

}
