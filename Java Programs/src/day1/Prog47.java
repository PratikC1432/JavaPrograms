//WAP to Swap two variables using 3rd variable
package day1;

import java.util.Scanner;

class Prog47
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		System.out.println("Before Swapping No1 " + no1 + " No2 " + no2);
		int temp = no1;
		no1 = no2;
		no2 = temp;
        System.out.println("After Swapping No1 " + no1 + " No2 " + no2);
	}
}
