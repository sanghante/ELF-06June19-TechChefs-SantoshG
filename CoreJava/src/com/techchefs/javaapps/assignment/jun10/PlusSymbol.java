package com.techchefs.javaapps.assignment.jun10;
public class PlusSymbol {

		public static void main(String[] args) {

			int n = 4; 
			char c = '*';

			for(int i=1;i<=n*2-1;i++) {
				if(i!=n) {
					for(int j=1;j<=n;j++) {
						if(j==n) {
							System.out.print(c);
						}
						
					System.out.print(" ");
					}//end for
				} else {
					for(int j=1;j<=n*2-1;j++) {
						System.out.print(c);
					}// end for
					System.out.println();
				
				}// end else
			
			}// end for
		
		}//end main
	
}//end class