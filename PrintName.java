package java_prgrm;

import java.util.Scanner;

public class PrintName
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name ");
		String name = sc.nextLine();
		//String name= "Ananya";
		String s= "i";
		
		//print your name 1000 time without using loop
		
		s=s.replaceAll("i","iiiiiiiiii");  //10
		s=s.replaceAll("i","iiiiiiiiii");  //10*10=100
		s=s.replaceAll("i","iiiiiiiiii");  //100*10=1000
		
		s=s.replaceAll("i",name+"\n");  
		System.out.println(s);
		
		
	}

}
