package day2;

import java.util.ArrayList;

public class Sample5 {

	public static void main(String[] args) {
		// if문
		boolean money =true;
		if(money) {
			System.out.println("택시탐");
		}else {
			System.out.println("걸어감");
		}
		//"만약 3000원 이상의 돈을 가지고 있으면 택시를 타고 그렇지 않으면 걸어가라"
		int x=3;
		int y=2;
		System.out.println(x>y);
		System.out.println(x==y);
		System.out.println(x!=y);
		
		int money2 =3000;
		if(money2>=3000) {
			System.out.println("택시탐");
		}else {
			System.out.println("걸어감");
		}
		
		// 돈이 3000원 이상 있거나 카드가 있다면 택시를 타고 그렇지 않으면 걸어가라"
		// x||y = or , x&&y = and , !x= x가 거짓이면 참이다
		int money3=2000;
		boolean card=true;

		if(money3>3000 || card) {
			System.out.println("택시타");
		}else {
			System.out.println("걸어가");
		}
		
		//"만약 주머니에 돈이 있으면 택시를 타고, 없으면 걸어가라“
		// contains 사용하기
		
		ArrayList<String> pocket = new ArrayList<>();
		pocket.add("money");
		if(pocket.contains("money")) {
			System.out.println("택시타");
		}else {
			System.out.println("걸어가");
		}
		
		//"지갑에 돈이 있으면 택시를 타고, 지갑엔 돈이 없지만 카드가 있으면 택시를 타고, 돈도 없고 카드도 없으면 걸어가라“
		ArrayList<String> pocket2 = new ArrayList<>();
		boolean card2=true;
		pocket2.add("money");
		if(pocket2.contains("money")) {
			System.out.println("택시탐");
		}else if(card2) {
			System.out.println("택시탐");
		}else {
			System.out.println("걸어감");
		}
	}

}
