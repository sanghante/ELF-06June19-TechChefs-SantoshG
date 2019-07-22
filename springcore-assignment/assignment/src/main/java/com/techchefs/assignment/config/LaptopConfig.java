package com.techchefs.assignment.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.techchefs.assignment.beans.Dell;
import com.techchefs.assignment.beans.HP;
import com.techchefs.assignment.beans.HardDisk;
import com.techchefs.assignment.beans.PenDrive;
import com.techchefs.assignment.interfaces.Laptop;
import com.techchefs.assignment.interfaces.StorageDevice;

@Configuration
public class LaptopConfig {
	
	@Bean(name = "harddisk")	
	public StorageDevice getHDD() {
		return new HardDisk();		
	}//End of ()
	
	@Bean(name = "pendrive")
	public StorageDevice getPenDrive() {
		return new PenDrive();		
	}//End of ()
	
	@Bean
	//@Qualifier("harddisk")
	public Laptop getDell() {
		Dell dell =  new Dell();
//		dell.setBrand("DELL");
//		dell.setColor("Silver");
//		dell.setCost(45000);
//		dell.setOs("Windows 10 pro");
//		dell.setRam(8);
//		dell.setWeight(2.1);
		return dell;
	}
	
	@Bean
	//@Qualifier("pendrive")
	public Laptop getHP() {
		HP hp = new HP();
//		hp.setBrand("HP");
//		hp.setColor("Black");
//		hp.setCost(39000);
//		hp.setOs("Windows 10 Home");
//		hp.setRam(4);
//		hp.setWeight(1.7);
		return hp;
		
	}

}//End of class
