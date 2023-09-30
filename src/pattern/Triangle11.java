package pattern;

import java.util.Scanner;

public class Triangle11 {
	public static void main(String[] args) {
		//to take values from the user input
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int n=scan.nextInt();
		
		//asking user to print the character
		System.out.println("enter the character that u want to print");
		char symbol =scan.next().charAt(0);
		//create n number of rows
		for(int i=1;i<=n;i++)
		{
			//create n number of spaces
			for(int space=1;space<=n-i+1;space++)
			{
				System.out.print(" ");
			}
				for(int j=1;j<=2*i-1;j++)
				{
					//checking the condition
					if(j==1||i==n||j==1||j==(2*i-1))
						//enter the symbol u want to print
					System.out.print(symbol);
					else
						System.out.print(" ");
				}
				System.out.println();
			}
		
		
	}

}
