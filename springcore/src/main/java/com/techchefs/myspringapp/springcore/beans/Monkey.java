package com.techchefs.myspringapp.springcore.beans;

import com.techchefs.myspringapp.springcore.interfaces.Animal;


public class Monkey implements Animal {

	@Override
	public void eat() {
		System.out.println("Monkey eating banana");
	}

	@Override
	public void makeSound() {
		System.out.println("Monkey making sound");
	}

}
