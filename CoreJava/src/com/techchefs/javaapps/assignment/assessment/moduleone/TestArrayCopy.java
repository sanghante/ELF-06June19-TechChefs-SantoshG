package com.techchefs.javaapps.assignment.assessment.moduleone;

public class TestArrayCopy {
	public static void main(String args[]){
		int a[]={10,20,30,40,50};
		int b[]=new int[a.length];
		
		//copying one array to another
		for(int i=0;i<a.length;++i){
			b[i]=a[i];
		}
		
		//printing array
		for(int i=0;i<b.length;++i){
			System.out.print(b[i]+" ");
		}
	}
}