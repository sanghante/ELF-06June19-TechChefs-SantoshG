package com.techchefs.javaapps.learning.jun21.annotations;

@FunctionalInterface
public interface ForAnnotations {
	
	void eat();
	
	default void hide() {
		System.out.println("Hide");
	}

}
