package java_prgrm;

import java.util.Scanner;

public class EvenOddArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array :");
		int a[]= new int[5];
		for(int i=0; i<=a.length-1; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("You enter the length in array :");
	/*	for(int i=0; i<=a.length-1; i++)
		{
			if(a[i]%2 ==0)
			{
				//System.out.println(a[i]);
				System.out.println("No is even :"+a[i]);
			}
		}
		for(int i=0; i<=a.length-1; i++)
		{
			if(a[i]%2 !=0)
			{
				System.out.println("No.is odd :"+a[i]);
			}
		}   */
		
		for(int i=0; i<=a.length-1; i++)
		{
			if(a[i]%2 ==0)
			{
				System.out.println("No. is even : "+a[i]);
			}
			else
			{
				System.out.println("No is odd : "+a[i]);
			}
		}
		      
	}
	//comment added

}
