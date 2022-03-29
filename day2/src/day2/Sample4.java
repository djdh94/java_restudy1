package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class Sample4 {
	public static void main(String[] args) {
		// 형변환
		
		// 문자열=>정수로 변환
		String num = "123";
		int num2 = Integer.parseInt(num);
		System.out.println(num2);
		
		// 1.정수=>문자열로 변환 , 빈문자열"" 더해주면됨
		int num3 = 123;
		String num4=""+num3;
		System.out.println(num4);
		// 2.정수=>문자열로 변환
		String num5=String.valueOf(num3);
		System.out.println(num5);
		// 3.정수=>문자열로 변환
		String num6=Integer.toString(num3);
		System.out.println(num6);
		
		
		
		
		
	}
}
