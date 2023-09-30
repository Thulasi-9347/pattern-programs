package pattern;

import java.util.Scanner;

public class Triangle12 {
	public static void main(String[] args) {
		//to ask user to print the values
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int n=scan.nextInt();
		
		//asking the user to print a character
		System.out.println("enter the character that u want to print");
		char symbol =scan.next().charAt(0);
		//print n number of rows
		for(int i=1;i<=n;i++)
		{
			//to create n number of spaces
			for(int space=1;space<=i;space++)
			{
				System.out.print(" ");
			}
				for(int j=1;j<=11-2*i;j++)
				{
					//checking the condition
					if(j==1||i==n||i==1||j==(11-2*i))
					System.out.print(symbol);
					else
						System.out.print(" ");

				}
				System.out.println();
			}
		
		
	}
}
