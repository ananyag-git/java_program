package java_prgrm;

import java.util.Scanner;

public class TwoEqualArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first length of array :");
		int a[] = new int[5];
		
		for(int i=0; i<=a.length-1; i++)
		{
			a[i] = sc.nextInt();
		}
	    System.out.println("Enter the second length of array : ");
		int b[] = new int[5];
		for(int j=0; j<=b.length-1; j++)
		{
			b[j] = sc.nextInt();
		}
		//for(int i=0; i<=a.length-1; i++)
		//{
			//for(int j=0; j<=b.length-1; j++)
		//if(a[k]==b[l])
		{
			System.out.println("Array is equal");
		}
		//else
		{
			System.out.println("Array is not equal");
		}
		
		//}
		
		
		
	}

}
