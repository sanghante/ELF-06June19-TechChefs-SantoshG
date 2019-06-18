package com.techchefs.javaapps.assignment.jun10;

public class Star4 {
	    public static void main(String args[])
	    {
	        int i, j, k=16, tim=1;
	        for(i=0; i<5; i++)
	        {
	            for(j=0; j<k; j++)
	            {
	                System.out.print(" ");
	            }
	            k = k - 4;
	            for(j=0; j<tim; j++)
	            {
	                System.out.print("* ");
	            }
	            tim = tim + 2;
	            System.out.println();
	        }
	    }
	}