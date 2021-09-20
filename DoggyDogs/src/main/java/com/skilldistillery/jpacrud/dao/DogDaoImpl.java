package com.skilldistillery.jpacrud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.jpacrud.entities.Dog;
@Transactional
@Service
public class DogDaoImpl implements DogDAO {
	@PersistenceContext
	private EntityManager em;

	
	@Override
	public List<Dog> findAll() {
		String jpql = "SELECT d FROM Dog d";
		return em.createQuery(jpql, Dog.class).getResultList();
	}

	@Override
	public Dog findById(int id) {
		return em.find(Dog.class, id);
	}

	@Override
	public Dog addDog(Dog dog) {
		
		em.getTransaction().begin();
		em.persist(dog);
		em.flush();
		em.getTransaction().commit();
		
		
		return dog;
	}

	@Override
	public Dog updateDog(int id, Dog dog) {
		Dog dbdog = em.find(Dog.class, id);
		em.getTransaction().begin();
		dbdog.setBreed(dog.getBreed());
		dbdog.setBreedGroup(dog.getBreedGroup());
		dbdog.setHeight(dog.getHeight());
		dbdog.setWeight(dog.getWeight());
		dbdog.setAvgLifeSpan(dog.getAvgLifeSpan());
		dbdog.setFriendlyScale(dog.getFriendlyScale());
		dbdog.setHealthAndGrooming(dog.getHealthAndGrooming());
		dbdog.setTrainabilityScale(dog.getTrainabilityScale());
		dbdog.setExerciseNeedsScale(dog.getExerciseNeedsScale());
		dbdog.setMoreInfo(dog.getMoreInfo());
		em.getTransaction().commit();
		em.close();
		
		return dbdog;
	}

	@Override
	public boolean deleteDog(int id) {
		boolean removedDog = false;
		Dog d = em.find(Dog.class, id);
		if(d !=null) {
			em.getTransaction().begin();
			em.remove(d);
			removedDog = !em.contains(d);
			em.getTransaction().commit();
		}
		em.close();
		return removedDog;
	}

	

}
