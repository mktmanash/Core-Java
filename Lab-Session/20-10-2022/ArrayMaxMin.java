package core_Java;

import java.util.Scanner;

public class ArrayMaxMin 
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
	     //Assuming
	     int max=arr[0];
	     int min=arr[0];
	     /*applying loop & conditions to find maximum and 
	      * minimum elements from the given array.
	      
	      */
	     for(int i=0;i<a;i++)
	     {
	    	 if(max<arr[i]) 
	    	 {
	    		max=arr[i]; 
	    	 }
	    	 else if (min>arr[i])
	    	 {
	    		 min=arr[i];
	    	 }
	     }
	     System.out.println("Maximum "+max+ " Minimum "+ min);
		

	}

}
