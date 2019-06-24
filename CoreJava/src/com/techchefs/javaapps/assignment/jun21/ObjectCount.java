package com.techchefs.javaapps.assignment.jun21;

public class ObjectCount {
	
	private static int counter;
	
	ObjectCount() {
		counter++;
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		counter--;
	}
	
	static int getInstanceCount() {
		return counter;
	}

	public static void main(String[] args) {

		new ObjectCount();
		new ObjectCount();
		new ObjectCount();
		
		System.out.println(getInstanceCount());
		
		new ObjectCount();
		new ObjectCount();
		new ObjectCount();
		
		System.out.println(getInstanceCount());
		
		new ObjectCount();
		
		for(int i=0;i<100000;i++) {
			
		}
		
		System.out.println(getInstanceCount());
	}

}
