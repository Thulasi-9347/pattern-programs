package pattern;

import java.util.Scanner;

public class Pattern6 {
public static void main(String[] args) {
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int a=scan.nextInt();
		
		System.out.println("enter the character that u want to print");
		char symbol =scan.next().charAt(0);
		//using for loop
		/*
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=a-i+1;j++)
			{
				System.out.print(symbol);
			}
			System.out.println();
		}
		*/
		// using while loop
		/*
		int i=1;
		while(i<=a) {
			int j=1;
			while(j<=a-i+1)
			{
				System.out.print(symbol);
			j++;
			}
			System.out.println();
			i++;
		}
		*/
		int i=1;
		do
		{
			int j=1;
			do
			{
				System.out.print(symbol);
				j++;
			}
			
				while(j<=a-i+1);
			System.out.println();
			i++;
			
		}
		while(i<=a);
		
}

}
