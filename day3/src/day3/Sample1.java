package day3;

public class Sample1 {

	public static void main(String[] args) {
		// while문 기본구조
		int threeHit = 0;
		while(threeHit<10) {
			threeHit++;
			System.out.println("나무를"+threeHit+"번 찍었습니다.");
			if(threeHit==10) {
				System.out.println("나무가 넘어갑니다");
			}
		}
		
		
		// while문 빠져나가기(break)
		int coffee=10;
		int money=300;
		while(money>0) {
			System.out.println("커피나왔습니다");
			coffee--;
			System.out.println("남은 커피의 양은"+coffee+"입니다");
			if(coffee==0) {
			System.out.println("커피가 소진되었습니디");
			break;
			}
		}
		
		// while문으로 컨티뉴 쓰기
		int a = 0;
		while(a<10) {
			a++;
			if(a%2==0) {
			continue;	
			}
			System.out.println(a);	
		}
		

	}

}
