package com.techchefs.assessment;

/**
 * 9)	WAP to display the list of products by type or by the given range. (Using Lambda and Stream)
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

/**
 * @author Santosh Ghante
 *
 */
@Log
public class TestProduct {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Product p1 = new Product(1, "Sony Music System", ProductType.ELECTRONICS, 7500);
		Product p2 = new Product(2, "Prestige Cooker", ProductType.AUTO_ACCESSORIES,  1500);
		Product p3 = new Product(3, "Double bedsheet", ProductType.FURNISHING,2500);
		Product p4 = new Product(4, "Stove", ProductType.KITCHEN, 3500);
		Product p5 = new Product(5, "Mixer/Grinder", ProductType.KITCHEN, 5500);
		Product p6 = new Product(6, "Car Shampoo", ProductType.AUTO_ACCESSORIES,700);
		Product p7 = new Product(7, "Curtains", ProductType.FURNISHING,7000);
		Product p8 = new Product(8, "Windsheild wipers", ProductType.AUTO_ACCESSORIES,1700);
		Product p9 = new Product(9, "Dewan bedsheet set", ProductType.FURNISHING,2500);
		Product p10 = new Product(10, "Chimney Stove combo", ProductType.KITCHEN, 12500);
		

		ArrayList<Product> productList = new ArrayList<>();
		
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);
		productList.add(p5);
		productList.add(p6);
		productList.add(p7);
		productList.add(p8);
		productList.add(p9);
		productList.add(p10);
		
		log.info("List of products by Type - Kitchen");		
		
		List<Product> kitchenProducts = productList.stream().filter(p -> p.getType().equals(ProductType.KITCHEN)).collect(Collectors.toList());
		kitchenProducts.forEach( p -> log.info(p.toString()));
		
		log.info("List of products by Type - Furnishing");		
		
		List<Product> furnishingProducts = productList.stream().filter(p -> p.getType().equals(ProductType.FURNISHING)).collect(Collectors.toList());
		furnishingProducts.forEach( p -> log.info(p.toString()));

		log.info("List of products by range");		
		List<Product>productsinRange = filterByRange(5000, 10000, productList);
		productsinRange.forEach( k -> log.info(k.toString()));
		
		
		
	}
	
	static List<Product> filterByRange(double lowerRange, double higerRange, ArrayList<Product> productList) {
		
		return productList.stream().filter( s -> s.getCost() >= lowerRange).filter( s -> s.getCost() <= higerRange).collect(Collectors.toList());		
		
	}

}
