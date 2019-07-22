package com.techchefs.assignment.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.techchefs.assignment.interfaces.Laptop;
import com.techchefs.assignment.interfaces.StorageDevice;

import lombok.Data;
import lombok.extern.java.Log;

@Log
@Data
public class HP implements Laptop {
	private String brand;
	private String color;
	private double cost;
	private double weight;
	private double ram;
	private String os;
	
	@Autowired
	@Qualifier(value = "pendrive")
	private StorageDevice storageDevice;

	public void display() {
		log.info("HP display() method ");

	}// End of display()

	public void process() {
		log.info("HP process() method ");

	}// End of process()

	public void showSpecification() {
		log.info("Brand is :" + brand);
		log.info("Color is :" + color);
		log.info("Cost is :" + cost);
		log.info("Weight is :" + weight);
		log.info("RAM is :" + ram);
		log.info("OS is :" + os);
		
		
		
	}// End of showSpecification()

	public void getStorage() {

		storageDevice.write();
		storageDevice.read();
		storageDevice.format();

	}// End of getStorage()

}// End of class
