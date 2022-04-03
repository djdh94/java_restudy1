package day5;


		/*생성자의 규칙
		
		클래스명과 메소드명이 동일하다.
		리턴타입을 정의하지 않는다. (void도 사용하지 않는다.)
		생성자는 객체가 생성될 때 호출된다. 즉, 생성자는 다음과 같이 new 키워드가 사용될 때 호출된다.*/

		class Animal2 {
		    String name;
		
		    void setName(String name) {
		        this.name = name;
		    }
		}
		
		class Dog2 extends Animal {
			
			
		    void sleep() {
		        System.out.println(this.name + " zzz");
		    }
		}
		
		class HouseDog2 extends Dog {
			
			HouseDog2(String name){
				this.setName(name);
			}
			
			// 생성자 오버로딩
			HouseDog2(int type){
				if(type==1) {
					this.setName("yorkshire");
				}
				else if(type==2) {
					this.setName("bulldog");
				}
			}
			
		    void sleep() {
		        System.out.println(this.name + " zzz in house");
		    }
		
		    void sleep(int hour) {
		        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }
}

		public class Sample2 {
		
			public static void main(String[] args) {
				
				HouseDog2 happy = new HouseDog2("happy");
				HouseDog2 yorkshire = new HouseDog2(1);
				System.out.println(happy.name);
				System.out.println(yorkshire.name);
				
				HouseDog2 dog = new HouseDog2("happy");
				System.out.println(dog.name);
				
		
		
		
		

	}

}
