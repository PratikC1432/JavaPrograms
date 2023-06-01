//WAP to create method smallest(int,int,int) to find smallest of three numbers given by the user
package day1;

import java.util.Scanner;
class Prog51 
{
	public static void smallest(int a,int b,int c){
		int res=(a<b?a:b)<c?(a<b?a:b):c;
		System.out.println("The Smallest No Is = " + res);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Smallest Of Three Number ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		smallest(a,b,c);
	}
}
