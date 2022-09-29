
 /*
   @author:MANASH KUMAR
   @date: 29 Sept 2022
 Ques2: Create a program to find largest of two numbers.
  */



package manas;

import java.util.Scanner;
 class Largest{
	public static void main(String[] args) {
		//create Scanner class to take input from user
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first number");
	int num1=sc.nextInt();
	System.out.println("enter Second number");
	int num2=sc.nextInt();
	//performing if else and apply conditions to check largest number
	if(num1>num2) {
	System.out.println("the largest of the given two number is "+ num1);
	}
	else if(num2>num1) {
		System.out.println("the largest of the given two number is "+ num2);
	
	}
	else {
		System.out.println("entered numbers are equal");
		
	}

}
}
