package com.techchefs.javaapps.learning.accessspecifiers.unclefamily;

import com.techchefs.javaapps.learning.accessspecifiers.Father;

public class Aunty extends Father{
	
	
	void use() {
		//atm(); // no access to private
		//car(); // no access to default
		bike();
		cycle();
	}

}
