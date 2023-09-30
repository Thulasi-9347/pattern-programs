package pattern;

import java.util.Scanner;

public class Pattern12 {
	public static void main(String[] args) {
		//taking the values from the user 
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int n=scan.nextInt();
		
		//enter the character that u want to perform
		System.out.println("enter the character that u want to print");
		char symbol =scan.next().charAt(0);
		//creating n number of rows
		for(int i=1;i<=n;i++)
		{
			//creating n number of spaces
			for(int space=1;space<=i;space++)
			{
				System.out.print(" ");
			}
			//displaying the symbol
				for(int m=1;m<=11-2*i;m++)
				{
					System.out.print(symbol);
				}
				System.out.println();
			}
		
		
	}

}
