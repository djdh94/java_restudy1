				package day4;
				
				/*class Updater {
				    void update(int count) {
				        count++;
				    }
				}
				
				class Counter {
				    int count = 0;  // 객체변수
				}
				
				public class Sample4 {
				    public static void main(String[] args) {
				        Counter myCounter = new Counter();
				        System.out.println("before update:"+myCounter.count);
				        Updater myUpdater = new Updater();
				        myUpdater.update(myCounter.count);
				        System.out.println("after update:"+myCounter.count);
				    }
				    
				    //결과값이 before update:0, after update:0 나온 이유는 update 메소드는 값(int 자료형)을 전달받았기 때문
				    
				}*/
				
				class Updater {
				    void update(Counter counter) {
				        counter.count++;
				    }
				}
				
				class Counter {
				    int count = 0;  // 객체변수
				}
				
				public class Sample4 {
				    public static void main(String[] args) {
				        Counter myCounter = new Counter();
				        System.out.println("before update:"+myCounter.count);
				        Updater myUpdater = new Updater();
				        myUpdater.update(myCounter);
				        System.out.println("after update:"+myCounter.count);
				    }
				}// 위랑 다르게 inct count를 Counter counter와 같이 객체를 전달받음
				// 호출 부분도 myUpdater.update(myCounter); 이렇게 바꾸고나서야 
				//before update:0
				//after update:1 이 출력됨
				
				//이렇게 메소드의 입력으로 객체를 전달받는 경우에는 메소드가 입력받은 객체를 그대로 사용하기 때문에 
				//메소드가 객체의 속성값을 변경하면 메소드 수행 후에도 객체의 변경된 속성값이 유지된다.
				
				// 이해가안되서 다시한번 봐야할것같음.
				
				
