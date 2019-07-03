package com.techchefs.javaapps.assignment.five;

public class ObjectCount {
	
	private static int counter;
	
	ObjectCount() {
		counter++;
	}
	
	@Override
	protected void finalize() throws Throwable {
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
		
		ObjectCount a = new ObjectCount();
		a = null;
		
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(getInstanceCount());
	}

}
