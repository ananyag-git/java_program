package java_prgrm;

import java.util.Scanner;

public class Fibonacci_series
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the length of series : ");
		int length = sc.nextInt();
		int n1=0;;
		int n2=1;
		int sum=0;
		System.out.print(" "+n1+" "+n2);
		for(int i=2;i<length; i++ )
		{
			sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.print(" "+sum);
		}
		
		
	}

}
