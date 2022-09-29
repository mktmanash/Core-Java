/*
  @author:MANASH KUMAR
  @date: 29 Sept 2022
 Ques3:Create a program for calculation.read three values from the user for operation
first and second values as operands.
third value as operator.
if user press1 => print addition of first and second
if user press2 => print subtraction of first and second
if user press3 => print multiplication of first and second
if user press4 => print division of first and second
 */




package manas;
import java.util.Scanner;

 class Calculation {
	public static void main(String[] args) {
		//create Scanner class to take input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter Second number");
		int num2=sc.nextInt();
		System.out.println("press 1 for addition; press 2 for subtraction; press 3 for multiplication; press 4 for divison;");
		//Take choice of user
		int choice=sc.nextInt();
		
		//Apply switch case to check user choice
		switch(choice) {
		case 1:
			System.out.println("Addition of the given two number is:"+(num1+num2));
			break;
		case 2:
			System.out.println("subtraction of the given two number is:"+(num1-num2));
			break;
		case 3:
			System.out.println("multiplication of the given two number is:"+(num1*num2));
			break;	
		case 4:
			System.out.println("Division of the given two number is:"+(num1/num2));
			break;
		default:
			System.out.println("You pressed wrong choice ");
		}
		
		
	}

}
