package core_Java;

import java.util.Scanner;

public class ArratOddSum {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//declaring array
		System.out.println("Enter the size of array");
		int a=sc.nextInt();
		int arr[]=new int[a];
		System.out.println("Enter numbers");
		//Traversing the array
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<a;i++)
		{
			/*applying modulo operator to check the enterd number
			is even or odd.*/
			if(arr[i]%2!=0)
			{
				sum=sum+arr[i];
						
			}
		}
			
			System.out.println("sum of all odd numbers from given array "+sum);
	}

	}
