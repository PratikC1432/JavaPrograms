//Find The Maximum And Minimum Element In The Array
class Prog58 
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5};
		int len = a.length;
		int min = 0;
		int max = 0;
		for(int i=0; i<len-1 ; i++)
		{
		  for(int j=i+1; i<len ; i++)
			  {
		       if(a[i] <= a[j]){
			   min = a[j];
		      }
		   }
		}
		System.out.println("Minimum " + min);
	}
}
