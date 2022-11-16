package practice;

import java.util.Scanner;

public class Newpalindrome {

	public static void main(String[] args) {

		// to count no of digits in number
		/*
		 * after creating demo,demo1branches
		 * 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----gitrep this is a token password
		 * int no=745282547; int count=0; while(no>0) { no= no/10; count++; }
		 * System.out.println("Number of digit from a given number is  "+ count);
		 */

		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a  new number");
		int number = scnr.nextInt();
		int originalnumb = number;
		System.out.println("original number entered " + originalnumb);
		System.out.println(number);
		int rev = 0;
		while (number != 0) {
			rev = rev * 10 + number % 10; // 0+12345%10=5 50+4=54
			System.out.println(rev);
			number = number / 10;
			System.out.println(number);
		}
		System.out.println("Reveresed number is " + rev);
		if (originalnumb == rev) {
			System.out.println("It is a palindrome number");
		} else {
			System.out.println("It is not a palindrome number");
		}

	}

}
