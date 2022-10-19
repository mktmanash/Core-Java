package core_Java;
import java.util.Scanner;
class ArrayEven 
{

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	//declaring array
	int arr[]=new int[10];
	System.out.println("Enter any 10 number");
	//Traversing the array
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<arr.length;i++)
	{
		/*applying modulo operator to check the enterd number
		is even or not.*/
		if(arr[i]%2==0)
		{
			System.out.print(arr[i]+" ");
		}
	}

	}

}

