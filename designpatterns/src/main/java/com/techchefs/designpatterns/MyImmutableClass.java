package com.techchefs.designpatterns;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public final class MyImmutableClass {

	private final String name;
	private final int age;
	private final double salary;
	
}
