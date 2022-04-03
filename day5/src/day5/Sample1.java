package day5;

class Animal{
	String name;
	
	void setName(String name) {
		this.name=name;
	}
}
	// animal 상속
class Dog extends Animal{
	// 부모클래스 기능확장
	void sleep() {
		System.out.println(this.name+"zzz in house");
	}
}
	// 메소드 오버라이딩
	class HouseDog extends Dog{
		// 메소드 오버로딩
		// 입력항목이 다른 경우 동일한 이름의 메소드를 만들 수 있는데 이를 메소드 오버로딩 이라고 한다.
		void sleep(int hour) {
			System.out.println(this.name+"zzz in hose for"+hour+"hours");
		}
	}
public class Sample1 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("boby");
		System.out.println(dog.name);
		dog.sleep();// bobay zzz 출력
		
		//Animal dog = new Dog(); Dog객체를 Animal 자료형으로 사용할 경우에는 Dog 클래스에만 존재하는 sleep 메소드를 사용할 수 없다 
		
		// Dog dog = new Animal();  // 컴파일 오류: 부모 클래스로 만든 객체는 자식 클래스의 자료형으로 사용할 수 없다.
		
		// 자바에서 만드는 모든 객체는 Object 자료형으로 사용할 수 있다
		Object animal = new Animal();  // Animal is a Object
		Object dog2 = new Dog();  // Dog is a Object
		
		// 메소드 오버라이딩
		HouseDog houseDog = new HouseDog();
		houseDog.setName("happy");
		houseDog.sleep();
		houseDog.sleep(3);
		

	}

}
