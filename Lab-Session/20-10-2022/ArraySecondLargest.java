package core_Java;
import java.util.Scanner;
class ArraySecondLargest
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
	     int i,j,temp;
	     //applying two loop to sort the given array in ascending order and traversing array
	     for( i=0;i<a;i++)
	     {
	    	 for(j=i+1;j<a;j++)
	    	 {
	    		 /*checking conditions for swaping the largest and smallest element 
	    		 using temp variable*/
	    		 if(arr[i]>arr[j])
	    		 {
	    			 //swaping
	    			 temp=arr[i];
	    			 arr[i]=arr[j];
	    			 arr[j]=temp;
	    			 
	    		 }
	    	 }
	     }
	     System.out.println("Second largest element from the given array is "+arr[a-2]);
	}
}
