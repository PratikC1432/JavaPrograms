//WAP to create method largest(int,int) to find largest of two number given by the user
package day1;

import java.util.Scanner;

class Prog50 
{
	public static void largest(int a,int b,int c){
		int res=(a>b?a:b)>c?(a>b?a:b):c;
		System.out.println("The Largest No is = " + res);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Three Numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		largest(a,b,c);
	}
}
