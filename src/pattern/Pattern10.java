package pattern;

import java.util.Scanner;

public class Pattern10 {
public static void main(String[] args) {
		
		
		//taking values from the user by using scanner class
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int n=scan.nextInt();
		
		//enter the character that u want to print
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
				System.out.print(symbol);
			}
			
		}
		System.out.println();
}
}