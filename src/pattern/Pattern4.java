package pattern;

import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args) {
		
	
	
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int rows=scan.nextInt();
		System.out.println("enter the number of columns");
		int columns=scan.nextInt();
		System.out.println("enter the character that u want to print");
		char symbol =scan.next().charAt(0);
		//using for loop
		/*
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=columns;j++)
			{
				System.out.print(symbol);
			}
			System.out.println();
		}
		*/
		//while using while loop
		/*
		int i=1;
		while(i<=rows)
		{
			int j=1;
			while(j<=columns)
			{
				System.out.print(symbol);
				j++;
			}
			System.out.println();
			i++;
		}
		*/
		//using do while loop
		
		int i=1;int j ;
		do
		{
			j=1;
			do
			{
				System.out.print(symbol);
				j++;
			}
				while(j<=columns);
			
				
				System.out.println();
				i++;
		}
			while(i<=rows);
		
		
						
	
		
}
}