package com.techchefs.javaapps.assignment.one;
public class IsPrime {

    boolean main(int r) {

        int num = r, i = 2;
        boolean flag = false;
        while(i <= num/2)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }

            ++i;
        }
		/*
		 * if (!flag) System.out.println(num + " is a prime number."); else
		 * System.out.println(num + " is not a prime number.");
		 */
        
        return !flag;
        
    }
}