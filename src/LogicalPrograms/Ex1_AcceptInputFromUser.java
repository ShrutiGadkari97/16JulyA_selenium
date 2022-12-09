package LogicalPrograms;

import java.util.Scanner;

public class Ex1_AcceptInputFromUser
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1=s1.nextInt();			// use to accept int input from user
		
		System.out.println("Enter num2: ");
		int num2=s1.nextInt();
		
		System.out.println(num1+num2);
		
		
	}

}
