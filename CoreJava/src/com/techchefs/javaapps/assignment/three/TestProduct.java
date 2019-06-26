package com.techchefs.javaapps.assignment.three;

public class TestProduct {
	
	public static void main(String[] args) {
		
		Product product[] = new Product[4];
		
		product[0] = new Product();
		product[0].setName("product 1");
		product[0].setDesc("Mens Shoes");
		product[0].setSku("MS001");
		product[0].setCost(120);
		
		product[1] = new Product();
		product[1].setName("product 2");
		product[1].setDesc("Mens Shoes");
		product[1].setSku("MS002");
		product[1].setCost(125);

		product[2] = new Product();
		product[2].setName("product 3");
		product[2].setDesc("Mens Shoes");
		product[2].setSku("MS003");
		product[2].setCost(175);
		
		product[3] = new Product();
		product[3].setName("product 4");
		product[3].setDesc("Mens Shoes");
		product[3].setSku("MS004");
		product[3].setCost(190);
		
		
		for (Product item : product) {
			System.out.println("Cost"+item.getCost());
			System.out.println("SKU"+item.getSku());
			System.out.println("Desc"+item.getDesc());
			System.out.println("Name"+item.getName());
			System.out.println("********************");
			
		}
		
	}
	

}
