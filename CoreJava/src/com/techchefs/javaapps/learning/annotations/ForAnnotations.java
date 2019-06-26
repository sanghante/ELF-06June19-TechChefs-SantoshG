package com.techchefs.javaapps.learning.annotations;

@FunctionalInterface
public interface ForAnnotations {
	
	void eat();
	
	default void hide() {
		System.out.println("Hide");
	}

}
