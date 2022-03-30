package day3;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample3 {

	public static void main(String[] args) {
		
		// for each 문(향상된 for문)
		String[] numbers={"one","two","three"};
		for(String number : numbers) {
			System.out.println(number);
		}
		
		// 배열에 향상된포문 사용
		ArrayList<String> test = new ArrayList<>(Arrays.asList("one","two","three"));
		for(String test1 : test) {
			System.out.println(test1);
		}

	}

}
