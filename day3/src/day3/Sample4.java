package day3;

public class Sample4 {

	public static void main(String[] args) {
		
			// 연습문제(2번)
		//while문을 사용해 1부터 1000까지의 자연수 중 3의 배수의 합을 구해 보자.
		int a=1;
		int total=0;
		while(a<1001) {
			a++;
			if(a%3==0) {
				total+=a;
			}
		}System.out.println(total);
		
		// 연습문제(3번)
		//while문 또는 for 문을 사용하여 다음과 같이 별(*)을 표시하는 프로그램을 작성해 보자.
		for(int i=1; i<5; i++) {
			for(int z=1; z<=i; z++) {
				System.out.print("*");
			}System.out.println();
		}
		
		// 연습문제(4번)
		// for문을 사용해 1부터 100까지의 숫자를 출력해 보자.
		for(int i=1; i<1001; i++) {
			System.out.println(i);
		}
		
		// 연습문제(5번)
		//for each 문을 사용하여 A 학급의 평균 점수를 구해 보자.
		int[] marks= {70,60,55,75,95,90,80,80,85,100};
		double total2=0;
		for(int num : marks) {
			total2+=num;
		}System.out.println(total2/10.0);
		
	}
}

