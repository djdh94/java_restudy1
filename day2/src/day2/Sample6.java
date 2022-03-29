package day2;

import java.util.Scanner;

public class Sample6 {

	public static void main(String[] args) {
		// switch
		Scanner scan = new Scanner(System.in);
		System.out.println("달을 입력해주세요");
		int test = scan.nextInt();
		String monthString="";
		
		switch(test) {
		case 1: monthString ="January";
		break;
		case 2: monthString="february";
		break;
		
		}
		System.out.println(monthString);

	}

}
