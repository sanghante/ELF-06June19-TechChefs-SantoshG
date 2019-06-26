package com.techchefs.javaapps.learning.sortingwithcomparable;

import java.util.Comparator;

public class Student implements Comparable<Student>, Comparator<Student> {

	private String name;
	private int id;
	private double percentage;
	
	Student(String name, int id, double percentage) {
		this.name = name;
		this.id = id;
		this.percentage = percentage;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public double getPercentage() {
		return percentage;
	}



	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}


	

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", percentage=" + percentage + "]";
	}

	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(percentage);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(percentage) != Double.doubleToLongBits(other.percentage))
			return false;
		return true;
	}



	void display() {
		System.out.println("Name is "+name);
		System.out.println("Id is "+id);
		System.out.println("Percentage is "+percentage);
	}



	@Override
	public int compareTo(Student o) {
		return this.getName().compareTo(o.getName());
	}



	// Use Lambda expression for this implementation
	@Override
	public int compare(Student o1, Student o2) {

		if (o1.getId() > o2.getId()) {
			return 1;
		} else if (o1.getId() < o2.getId()) {
			return 2;
		} else {
			return 0;
		}
	}	 



	/* Logic to sort student wrt to ID
	 * @Override public int compareTo(Student o) { if (this.getId() > o.getId())
	 * return 1; else if (this.getId() < o.getId()) return -1; else return 0; }
	 */
	
	
}
