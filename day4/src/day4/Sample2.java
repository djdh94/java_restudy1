package day4;

class Animal{
	
	//클래스에 선언된 변수를 객체 변수 라고 한다
	String name;
	
	public void setName(String name) {
		this.name=name;
	}
}

public class Sample2 {

	public static void main(String[] args) {
		
		// 객체 만들기
		// 과자를 예로 들었을때 과자를 만드는 틀을 class 이고 만들어진 과자는 객체라고 보면됨
		// 여기서는 Animal이 = 클래스 , cat=객체
		Animal cat = new Animal();
		
		// 메서드 호출(상단의 this는 cat을 지칭함)
		cat.setName("boby");
		//객체.객체변수(객체 변수는 다음과 같이 도트연산자(.)를 이용하여 접근할 수 있다.)
		System.out.println(cat.name);
		
		Animal dog = new Animal();
		dog.setName("dog");
		System.out.println(dog.name);
		
	}
	

}
