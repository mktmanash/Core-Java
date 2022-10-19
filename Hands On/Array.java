package core_Java;
class Array
{
	public static void main(String[] args) 
	{
		//Declaring and instantiating the array
		String a[] =new String[3];		
		//initialization
		a[0]="Manas";
		a[1]="Kumar";
		a[2]="Tiwari";
		//traversing the array
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
