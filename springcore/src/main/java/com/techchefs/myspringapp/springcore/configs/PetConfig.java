package com.techchefs.myspringapp.springcore.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.techchefs.myspringapp.springcore.beans.Donkey;
import com.techchefs.myspringapp.springcore.beans.Monkey;
import com.techchefs.myspringapp.springcore.beans.Pet;

@Configuration
public class PetConfig {
	
	@Bean(name = "monkey")
	public Monkey getMonkey() {
		return new Monkey();
	}
	
	@Bean(name = "donkey")
	public Donkey getDonkey() {
		return new Donkey();
	}
	
	@Bean
	public Pet getPet() {
		Pet p = new Pet();
		p.setName("Dhasu");
		return p;
	}

}
