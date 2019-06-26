package com.techchefs.javaapps.assignment.four;

public class TestArrayCopy {

	public static void main(String[] args) {
		
		int[] source = {1,3,4,6,7,8,9,10};
		int[] dest = {11,13,45,14,16,17,22,33,22,11,23};
		
		int destIndex=2,sourceIndex=3, numOfElements=3;
		
		for (; destIndex < dest.length && sourceIndex < source.length  && numOfElements > 0 ; destIndex++, sourceIndex++, numOfElements--) {
			dest[destIndex] = source[sourceIndex];
		}

		
		//System.arraycopy(source, sourceIndex, dest, destIndex, numOfElements);
		
		for(int t : dest) {
			System.out.println(t);
		}
	}
	

}
