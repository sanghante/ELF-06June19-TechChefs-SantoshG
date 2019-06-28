package com.techchefs.assessment;

/**
 * @author Santosh
 * 
 * 15)	WAP to display the content of object using lambda expression
 */

import java.util.ArrayList;
import java.util.function.Consumer;

import lombok.extern.java.Log;

@Log
public class DisplayProductUsingLamdba {

	public static void main(String[] args) {
		
		Product p1 = new Product(1, "Sony Music System", ProductType.ELECTRONICS, 7500);
		Product p2 = new Product(2, "Prestige Cooker", ProductType.AUTO_ACCESSORIES,  1500);
		Product p3 = new Product(3, "Curtain", ProductType.FURNISHING,2500);
		Product p4 = new Product(4, "Stove", ProductType.KITCHEN, 3500);
		Product p5 = new Product(5, "Chimney", ProductType.KITCHEN, 5500);
		
		ArrayList<Product> productList = new ArrayList<>();
		
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);
		productList.add(p5);
		
		log.info("Displaying product object using lambda");
		
		Consumer<Product> consumer = p -> 
			log.info("Product id :"+p.getCost()+" Product name :"+p.getName()+"Product type :"+p.getType()+" Product cost "+p.getCost());
		

		//display products	
		productList.stream().forEach(consumer::accept);

	}

}
