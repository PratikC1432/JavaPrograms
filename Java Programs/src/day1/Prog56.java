//Find the average of all the elements in the given array
package day1;

class Prog56 
{
	public static void main(String[] args) 
	{
		int a[] = {10,20,30,40,50};
		int sum=0;
		int count = a.length;
		System.out.println(count);
		for(int i=1; i<count; i++){
			sum += a[i];
		}
		System.out.println("Average = " + (sum/count));
	}
}
