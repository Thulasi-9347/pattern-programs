package pattern;

import java.util.Scanner;

public class Pattern14 {
	public static void main(String[] args) {
		
//taking the values from user input
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int n=scan.nextInt();
		
		//asking user to perform operation
		System.out.println("enter the character that u want to print");
		char symbol =scan.next().charAt(0);
		//to print rows
				for(int i=1;i<=n;i++)
				{
					System.out.println();
					//create n number of spaces to print
					for(int space=1;space<=n;space++)
					{
						System.out.print(" ");
					}
					//to print hollow spaces 
					for(int j=1;j<=5;j++)
					{
						if(i==1 ||j==1||i==n||j==n)
						{
							System.out.print(symbol);
						}
						else
						{
							System.out.print(" ");
						}
					
					
				
					
				}
				}	

	}
}
