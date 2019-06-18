package com.techchefs.javaapps.assignment.jun10;

public class Star6 {

	   public static void main(String args[])
	    {
	        int i, space, rows, k=0;
	        rows = 5;
	        for(i=1; i<=rows; i++)
	        {
	            for(space=1; space<=(rows-i); space++)
	            {
	                System.out.print("  ");
	            }
	            while(k != (2*i-1))
	            {
	                System.out.print("* ");
	                k++;
	            }
	            k = 0;
	            System.out.println();
	        }
	    }
	}