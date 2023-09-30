package pattern;

import java.util.Scanner;

public class Pattern7 {
public static void main(String[] args) {
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int rows=scan.nextInt();
		System.out.println("enter the number of columns");
		int column=scan.nextInt();
		
		System.out.println("enter the character that u want to print");
		char symbol =scan.next().charAt(0);
		//to print rows
		for(int i=1;i<=rows;i++)
		{
			System.out.println();
			//to print n spaces in every row
			for(int space=1;space<=rows;space++)
			{
				System.out.print(" ");
			}
			//to print n stars in every row
			for(int j=1;j<=column;j++)
			{
				System.out.print( symbol);
			}
			//to print cursor to the next line
		}
		
}
}