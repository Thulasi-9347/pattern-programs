package pattern;

import java.util.Scanner;

public class Pattern5 {
	public static void main(String[] args) {
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int rows=scan.nextInt();
		
		System.out.println("enter the character that u want to print");
		char symbol =scan.next().charAt(0);
		//using for loop
		/*
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(symbol);
			}
			System.out.println();
		}
		*/
		//using while loop
		
		int i=1;
		while(i<=rows)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print(symbol);
				j++;
			}
			System.out.println();
			i++;
		}
		
		//using do while loop
		/*
		int i=1;int j ;
		do
		{
			j=1;
			do
			{
				System.out.print(symbol);
				j++;
			}
				while(j<=i);
			
				
				System.out.println();
				i++;
		}
			while(i<=rows);
		
		*/
}
}