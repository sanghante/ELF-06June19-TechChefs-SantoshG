package com.techchefs.javaapps.learning.annotations;

public class MyArrayList {

	private Object[] myArray = null;
	private int index;

	int size() {
		return index - 1;
	}

	public MyArrayList() {
		this(10);
	}

	public MyArrayList(int size) {
		if (size < 1)
			throw new ArrayIndexOutOfBoundsException("size should be greater than 0");
		myArray = new Object[size];
		index = 0;
	}

	public void add(Object val) {

		if (index > myArray.length - 1) {
			Object[] tempArray = new Object[myArray.length * 2];
			System.arraycopy(myArray, 0, tempArray, 0, myArray.length);
			myArray = tempArray;
		}

		myArray[index] = val;
		index++;

	}

	public Object get(int pos) {
		if (pos >= 0 && pos < myArray.length) {
			return myArray[pos];
		}

		return null;
	}

	/*
	 * public void remove(int pos) {
	 * 
	 * if (pos >= 0 && pos <= index) { for (int i = pos; i < index; i++) {
	 * myArray[i] = myArray[i + 1]; } myArray[index] = null; index--; } }
	 */

	public void remove(int pos) {

		if (pos >= myArray.length - 1) {
			throw new ArrayIndexOutOfBoundsException("Array size is " + myArray.length);
		}

		System.arraycopy(myArray, pos + 1, myArray, pos, index - pos);
		myArray[index] = null;
		index--;
	}

}
