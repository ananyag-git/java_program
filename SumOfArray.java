package java_prgrm;

import java.util.Scanner;

public class SumOfArray
{
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length :");
		int a[] = new int[5];
		for(int i=0; i<=a.length-1; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("You entered :");
		int sum=0;
		for(int i=0; i<=a.length-1; i++)
		{
			sum=sum+a[i];
		}
			System.out.println(sum);
	}

}
