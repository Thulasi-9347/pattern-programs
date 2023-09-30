package pattern;

import java.util.Scanner;

public class Triangle10 {
public static void main(String[] args) {
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int n=scan.nextInt();
		
		
		System.out.println("enter the character that u want to print");
		char symbol =scan.next().charAt(0);
		//to print rows
		for(int i=1;i<=n;i++)
		{
			System.out.println();
			//to print  n spaces in row
			for(int space=i;space<=n;space++)
			{
				System.out.print(" ");
			}
			//to print n stars in row
			for(int j=1;j<=n-i+1;j++)
			{
			if(i==n||j==1||i==1||j==(6-i))
				{
				System.out.print(symbol);
			}
				else
				{
					System.out.print(" ");
				}
			}
			
		}
		System.out.println();
}

}
