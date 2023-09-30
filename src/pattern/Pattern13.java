package pattern;

import java.util.Scanner;

public class Pattern13 {
public static void main(String[] args) {
	
//taking user input from scanner class
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number of rows");
	int n=scan.nextInt();
	
	//enter the operation that u want to perform
	System.out.println("enter the character that u want to print");
	char symbol =scan.next().charAt(0);
	//to print rows
	for(int i=1;i<=n;i++)
	{
		//creating n number of spaces
		for(int space=1;space<=n-i+1;space++)
		{
			System.out.print(" ");
		}
		//enter the symbol to print
		for(int j=1;j<=2*i-1;j++)
		{
			System.out.print(symbol);
		}
		System.out.println();
	}
	//to print rows in reverse order
		for(int i=n-1;i>=1;i--)
		{
			//to create n number of spaces 
			for(int space=1;space<=n-i+1;space++)
			{
				System.out.print(" ");
			}
			//enter the symbol that u want to print
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(symbol);
			}
			System.out.println();

		
}

}
}

