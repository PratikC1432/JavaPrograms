package day1;

import java.util.Scanner;

class Prog44
{
	public static void main(String[] args)
	{
		int no=145;
		for(int i=no; no!=0; no/=10)
		{
		 int rem=i%10;
		 sum+=rem;
		 pro*=rem;
		}
		if(sum==pro){
			System.out.println("Spy Number");
		}else{
			System.out.println("Not Spy No");
		}
	}
}