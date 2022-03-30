package day3;

public class Sample2 {

	public static void main(String[] args) {
		// 기본 for문
		String[] numbers = {"one","two","three"};
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		// for문 예제
		int[] num= {90,25,67,45,80};
		for(int z=0; z<num.length; z++) {
			if(num[z]>60) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
		}
		
		// for문에 continue 쓰기
		int[] num2= {90,25,67,45,80};
		for(int z=0; z<num.length; z++) {
			if(num2[z]<60) {
				continue;
			}
		else
				System.out.println("합격입니다");
			}
		
		// 이중 for문 사용하기(구구단)
		for(int i=2; i<10; i++) {
			System.out.println(i+"단");
			for(int z=1; z<10; z++) {
			System.out.println(i+"*"+z+"="+i*z);	
			}
		}
		
		
		
		
		}
		

	}


