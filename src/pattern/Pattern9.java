package pattern;

import java.util.Scanner;

public class Pattern9 {
	public static void main(String[] args) {
		
	
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number of rows");
	int n=scan.nextInt();
	
	
	System.out.println("enter the character that u want to print");
	char symbol =scan.next().charAt(0);
	// to print rows
	for(int i=1;i<=n;i++)
	{
		System.out.println();
		//to print i no rows in every space
		for(int space=i;space<=n;space++)
		{
			System.out.print(" ");
		}
		//to print i no n stars in every row
		for(int j=1;j<=i;j++)
		{
			System.out.print(symbol);
		}
		
	}
	System.out.println();
}
}