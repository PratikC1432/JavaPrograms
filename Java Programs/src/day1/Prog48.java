//WAP to Swap two variables without using 3rd variable
package day1;

import java.util.Scanner;

class Prog48 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		System.out.println("Before Swapping No1 " + no1 + " No2 " + no2);
		no1 = no2 + no1;
		no2 = no1 - no2;
		no1 = no1 - no2;
        System.out.println("After Swapping No1 " + no1 + " No2 " + no2);
	}
}
