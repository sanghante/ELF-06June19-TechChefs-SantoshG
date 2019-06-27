package com.techchefs.javaapps.learning.constructorreference;

import lombok.extern.java.Log;

@Log
public class TestConstructorReference {

	public static void main(String[] args) {
		
		PenFactory pFactory = Pen :: new ;
		
		Pen p = pFactory.getPen();
		p.write();
		
		MyBoy boy = Boy :: new ;
		Boy ramu = boy.getBoy(12, "Ramu", 155.5);
		
		log.info("Boy name is "+ramu.name);
		log.info("Boy age is "+ramu.age);
		log.info("Boy height is "+ramu.height);
		
		ProductFactory factory = Product :: new;
		Product p1 = factory.getProduct("Krishna statue", 4500);
		log.info("Product name "+p1.name);
		log.info("Product cost "+p1.cost);		
		
	}
}

interface PenFactory {
	Pen getPen();
}

interface MyBoy {
	Boy getBoy(int age, String name, double height);
}

interface ProductFactory {
	Product getProduct(String name, double cost);
}