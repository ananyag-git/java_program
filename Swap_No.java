package java_prgrm;

public class Swap_No
{
	public static void main(String[] args)
	{
		int a= 10;
		int b=20;
		
		//using third variable
		
		System.out.println("Before swapping the no "+a+" "+b);
		/*int t=a;
		a=b;
		b=t;
		System.out.println("After swapping "+a+" "+b);  */
		
		//without using third variable
		
		a= a+b;
		b= a-b;
		a= a-b;
		System.out.println("Aftr swapping "+a+" "+b);
		
	}

}
