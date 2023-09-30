package com.kodnest.practise;

public class Trianglepattern {
	public static void main(String[] args) {
		/* 1)triangle pattern
*		 
**
***
****
*****
******
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
		
		System.out.println();
		}
	
*/
	/* 2)square pattern
 ******
******
******
******
******
******
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=5;j++)
			{
				System.out.print("*");
			}
		
		System.out.println();
		}
		*/
		for(int i=0;i<=5;i++)
		{
			for(int k=0;k<=5;k++)
			{
				System.out.println(" ");
			
			for(int j=1;j<=5-i-1;j++)
			{
				System.out.print("*");
			}
			}
		System.out.println();
		}
		
	}		
}
