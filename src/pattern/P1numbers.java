package pattern;

import java.util.Scanner;

public class P1numbers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=scan.nextInt();
		/*3)
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(i);
			}
			System.out.println();
		}
*/
		/*1)
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=a;j++)
			{
				
				System.out.print(i);
			}
			System.out.println();
		}
		*/
		/*2)
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=a;j++)
			{
				
				
				System.out.print(j);
			}
			System.out.println();
		}
		*/
		/*4)
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
				
				System.out.print(j);
			}
			System.out.println();
		}
		*/
		/*5)
		int k=1;
		for(int i=1;i<=a;i++)
		{
			
			for(int j=1;j<=a;j++)
			{
				
				System.out.print(k+++" ");
				
				
			
			}
			System.out.println();
		}
		*/
		
		/*9)
		int k=1;
		for(int i=1;i<=a;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+++" ");
				
				
			
			}
			System.out.println();
		
		}
		*/
		
		/*6)
		int k=a*a;
		for(int i=1;i<=a;i++)
		{
			
			for(int j=1;j<=a;j++)
			{
				System.out.print(k+" ");
				k--;
				
			
			}
			System.out.println();
		
		}
		
		/*7)
		int count=1;
		for(int i=1;i<=a;i++)
		{
			
			for(int j=1;j<=a;j++)
			{
				if(count<10)
				{
				System.out.print("0"+count+" ");
				
				}
				else
				{
					System.out.print(count+" ");
				}
			count++;
			}
			System.out.println();
		}
		*/
		/*10)
		int count=2;
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=a;j++)
			{
			if(count<=8&&count%2==0)
			{
				System.out.print("0"+count+" ");
			}
			else
			{
				System.out.print(count+" ");
			}
			count+=2;
			
			}
			System.out.println();
		}
		*/
		/*
		int count=1;
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=a;j++)
			{
			if(count<=9)
			{
				System.out.print("0");
			}
			else
			{
				System.out.print(count+" ");
			}
			count--;
			
			}
			System.out.println();
		}
		*/
/*11)
		int count=1;
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=a;j++)
			{
			if(count<=9&&count%2!=0)
			{
				System.out.print("0"+count+" ");
			}
			else
			{
				System.out.print(count+" ");
			}
			count=count+2;
			
			}
			System.out.println();
		}
		*/
		/*8)
		int k=a*a;
		for(int i=1;i<=a;i++)
		{
			
			for(int j=1;j<=a;j++)
			{
				if(k<=9) {
				System.out.print("0"+k+" ");
				}
				else {
					System.out.print(k+" ");
				}
				
				k--;		
			}
			System.out.println();
		
		}
		*/
		
		}
	
	}

