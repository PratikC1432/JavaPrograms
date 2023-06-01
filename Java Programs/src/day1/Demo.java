class Demo 
{
	public static int SecondLargest(int[] a){
		int temp;
		int j;
		for(int i=0; i<a.length; i++){
			for(j=i+1; j<a.length; j++){
				if(a[i]>a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[a.length-2];
	}
	public static void main(String[] args) 
	{
		int a[] = {10,50,60,40,70};
		System.out.println("Second Largest No Is" + getSecondLargest(a));
	}
}
