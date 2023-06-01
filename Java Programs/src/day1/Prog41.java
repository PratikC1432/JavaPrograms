package day1;

import java.util.Scanner;

class Prog41 
{
	public static int strong(int n)
    {
	  int fact=1;
	  for(int i=1; i<n; i++)
	  {
		 fact*=i;
	  }
	  return fact;
    }
	public static void last(int n){
		int sum=0;
		for(int i=n; i!=0; i=i/10){
			int rem=n%10;
			sum+=fact(rem);
	}
	System.out.println(sum);
	if(sum==n)
	{
	 System.out.println("Strong No");
	}else{
		System.out.println("Not Strong No");
	}
}
public static int facto(int n){
	int fact=1;
	for(int i=1; i<=n; i++){
		fact=fact*i;
	}
	return fact;
}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		strong(145);
	}
}
