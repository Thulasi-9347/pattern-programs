package pattern;

import java.util.Scanner;

public class Triangle13 {
	public static void main(String[] args) {
		

		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int n=scan.nextInt();
		
		
		System.out.println("enter the character that u want to print");
		char symbol =scan.next().charAt(0);
		//to print rows
		for(int i=1;i<=n;i++)
		{
			//to print i no rows in every space
			for(int space=1;space<=n-i+1;space++)
			{
				System.out.print(" ");
			}
			//to print i no n stars in every row
			for(int j=1;j<=2*i-1;j++)
			{
				if(j==1||i==1||i==n||j==(2*i-1))
				System.out.print(symbol);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
			for(int i=n-1;i>=1;i--)
			{
				for(int space=1;space<=n-i+1;space++)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=2*i-1;j++)
				{
					if(i==n||i==1||j==1||j==(2*i-1))
					System.out.print(symbol);
					else
						System.out.print(" ");

				}
				System.out.println();
}
	}
}