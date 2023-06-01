//WAP to create method area(int String) where int is the size/radius String is the shape And find area of "circle" and "square" accordingaly
package day1;

import java.util.Scanner;

class Prog49 
{
	public static void area(int a,String s){
	
		if(s == "square"){
			System.out.println("Area of square " + (a + a));
		}
		if(s == "circle"){
			System.out.println("Area of circle " + (3.14*a*a));
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String s = sc.next();
	     area(a,s);
	}
}
