package com.techchefs.myspringapp.springcore.beans;

import com.techchefs.myspringapp.springcore.interfaces.Animal;

public class Donkey implements Animal {

	@Override
	public void eat() {
		System.out.println("Donkey eating grass");

	}

	@Override
	public void makeSound() {
		System.out.println("Donkey making sound");
	}

}
