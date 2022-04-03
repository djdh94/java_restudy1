package day5;


interface Predator{
	
	String getFood();
	
	// 디폴트 메서드
	default void printFood() {
		System.out.printf("my food is %s/n",getFood());
	}
	
	// 스태틱 메서드
	  int LEG_COUNT = 4;  // 인터페이스 상수

	    static int speed() {
	        return LEG_COUNT * 30;
	    }
}

	class Animal3{
		String name;
		void setName(String name) {
			this.name = name;
		}
	}
	
	class Tiger extends Animal3 implements Predator{
		
		public String getFood() {
			return "apple";
		}
	}
	
class Lion extends Animal3 implements Predator{
	public String getFood() {
		return "banana";
	}
	}
	
 /*  ZooKeeper 클래스의 feed 메소드처럼 입력값의 자료형 타입이 다를 경우(위에서는 Tiger, Lion으로 서로 다르다) 메소드 명을 
   동일하게(여기서는 메소드명이 feed로 동일하다) 사용할 수 있다. 이런것을 메소드 오버로딩이라고 한다.
  */
	
	
	class Zookeeper {
		/*변경전
				void feed(Lion lion) {
					System.out.println("feed banana");
				} */
		
		//변경후
		void feed(Predator predator) {
			System.out.println("feed :"+ predator.getFood());
		}
	}
	
	public class Sample3 {
	
	public static void main(String[] args) {
		Zookeeper zooKeeper = new Zookeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		zooKeeper.feed(tiger);
		zooKeeper.feed(lion);

	}

}
