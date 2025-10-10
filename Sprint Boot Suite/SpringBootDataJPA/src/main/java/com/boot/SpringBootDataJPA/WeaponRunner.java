package com.boot.SpringBootDataJPA;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.boot.SpringBootDataJPA.model.Weapon;
import com.boot.SpringBootDataJPA.repo.WeaponRepo;

@Component
public class WeaponRunner implements CommandLineRunner {

	@Autowired
	WeaponRepo wrepo;

	@Override
	public void run(String... args) throws Exception {
		// Insert
		// save(obj)
		// Single record
//		Weapon obj = new Weapon(101, "AK-47", "Assault Rifle");
//		wrepo.save(obj);
//		
//		System.out.println("Record Inserted");

		// Multiple record
//		wrepo.saveAll(java.util.List.of(new Weapon(102, "M16", "Assault Rifle"), new Weapon(103, "Glock 17", "Pistol"),
//				new Weapon(104, "Desert Eagle", "Pistol"), new Weapon(105, "MP5", "Submachine Gun")));
//		System.out.println("Multiple Records Inserted");
		
		//Find all
//	   List<Weapon> list = wrepo.findAll();
//	   for(Weapon w:list) {
//		   System.out.println(w.getId()+" "+w.getName()+" "+w.getType());
//	   }
		
//			   //Find by id
//		Optional<Weapon> op = wrepo.findById(103);
//		
//		if(op.isPresent()) {
//			Weapon w = op.get();
//			System.out.println(w.getId()+" "+w.getName()+" "+w.getType());
//		} else {
//			System.out.println("Record not found");
//		}
		
		//Delete by id
		wrepo.deleteById(105);
		System.out.println("Record Deleted");
	}

}
