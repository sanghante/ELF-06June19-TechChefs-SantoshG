package com.techchefs.javaapps.learning.jun13.accessspecifiers.uncleFamily;

import com.techchefs.javaapps.learning.jun13.accessspecifiers.Father;

public class Aunty extends Father{
	
	
	void use() {
		//atm(); // no access to private
		//car(); // no access to default
		bike();
		cycle();
	}

}
