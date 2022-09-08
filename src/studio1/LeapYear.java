package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a year to check if it's a leap year: ");
		int year = in.nextInt();
		boolean leapYear = year%4 == 0 && (year%100 != 0 || year%400 == 0);
		System.out.println(leapYear);
	}

}
