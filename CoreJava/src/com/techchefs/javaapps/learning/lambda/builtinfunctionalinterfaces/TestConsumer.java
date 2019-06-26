package com.techchefs.javaapps.learning.lambda.builtinfunctionalinterfaces;

import java.util.function.Consumer;

public class TestConsumer {

	public static void main(String[] args) {

		Student puttGowri = new Student(99,98,97);
		
		getAvg(puttGowri);
		
		Consumer<Student> consumer = (s) ->  System.out.println( (s.physics + s.chemistry + s.maths)/ 3.0 );
		
		consumer.accept(puttGowri);
	}
	
	static void getAvg(Student s) {
		System.out.println( (s.physics + s.chemistry + s.maths) / 3.0 ) ;
	}	
}

class Student {

	int physics;
	int chemistry;
	int maths;
	Student(int p, int c, int m) {
		this.physics =  p;
		this.chemistry = c;
		this.maths = m;
	}

}

