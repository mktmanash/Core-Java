package core_Java;

import java.util.Scanner;

class ArrayAverage
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the size of array");
	     int a=sc.nextInt();
	     System.out.println("Enter the array elements");
	     int arr[]=new int[a];
	     //traversing array
	     for(int i=0;i<a;i++)
	     {
	    	 arr[i]=sc.nextInt();
	     }
	     int sum=0;
	     //traversing array and summing the array elements
	     for(int i=0;i<a;i++)
	     {
	    	 sum=sum+arr[i];
	     }
	     //calculating average of the array elements
	     int avg=sum/a;
	     System.out.println("Average of the array elements are:"+avg);
	     
	     

	}

}
