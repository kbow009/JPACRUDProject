package com.skilldistillery.jpacrud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.jpacrud.dao.DogDAO;
import com.skilldistillery.jpacrud.entities.Dog;

@Controller
public class DogController {
	
	@Autowired
	private DogDAO dao;

	@RequestMapping(path= {"/", "home.do"})
	public String home(Model model) {
		model.addAttribute("dogs", dao.findAll());
		return "home";
	}
	@RequestMapping(path ="getDogs.do")
	public String showDogs(Integer fid, Model model) {
		
		model.addAttribute("dogs", dao.findById(fid) );
		return "dog/show";
	}
	@RequestMapping(path ="addDogs.do")
	public String addDog(Dog dog, Model model) {
		 
		model.addAttribute("dogs", dao.addDog(dog));
		return "dog/add";
		
	}
//	@RequestMapping(path ="update.do")
//	public String updateDog(Integer id, Model model, Dog dog) {
//		
//		model.addAttribute("dogs", dao.updateDog(id, dog) );
//		return "dog/update";
//		
//	}
	@RequestMapping(path ="delete.do")
	public String deleteDog(Integer id, Model model) {
		
		model.addAttribute("dogs", dao.deleteDog(id));
		return "dog/delete";
		
	}
	@RequestMapping(path ="updateDogs.do")
	public String updateForm(Integer id, Model model) {
		
		model.addAttribute("dogs", dao.findById(id) );
		return "dog/update";
		
	}
	
	
}
