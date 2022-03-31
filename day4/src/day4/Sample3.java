package day4;

public class Sample3 {
	
	//입출력 모두있는 메소드
	int sum(int a, int b) { // a,b는 매개변수
	    return a+b;
	}
	
	//입력값이 없는 메소드
	String say() {
		return "hi";
	}
	
	//리턴값이 없는 메소드
	void sum2(int c,int d) {
		System.out.println(c+"과"+d+"의합은"+(c+d));
	}
	
	//입력값도 리턴값도 없는 메소드
	void say2() {
		System.out.println("hi");
	}
	
	// 메소드 생성(49번라인)
	 void varTest(int e) {
	        e++;
	    }
	 
	 // 25번 라인=메소드 내부에 있던걸 외부에서도 쓰려면 리턴문을 사용하면됨
	 int varTest2(int f) {
		 f++;
		 return f;
	 }
	
	public static void main(String[] args) {
		
		// 일반적인 입출력 모두있는 메소드(리턴값받을변수 = 객체.메소드명(입력인수1, 입력인수2, ...))
		Sample3 sample = new Sample3();
        int c = sample.sum(3, 4); // 3,4 는 인수

        System.out.println(c); //7 출력
        
        //입력값이 없는 메소드(리턴값받을변수 = 객체.메소드명())
        String a = sample.say();
        System.out.println(a);
        
        //리턴값이 없는 메소드(객체.메소드명(입력인수1, 입력인수2, ...))
        sample.sum2(3, 4);
        
    	//입력값도 리턴값도 없는 메소드(객체.메소드명())
        sample.say2();
        
        // 27번 라인에서 ++를 했으므로 출력시에 원래는 2가되어야하지만, 
        // 메소드내에서 사용되는 변수는 메소드 안에서만 쓰이고 밖에서는 변수명이 같다해도 다른걸로 취급
        int e = 1;
        //Sample3 sample = new Sample3(); 원래는써야하지만 위에 생성해놨으므로 생략
        sample.varTest(e);
        System.out.println(e);
        
        // 56번 라인=메소드 내부에 있던걸 외부에서도 쓰려면 리턴문을 사용하면됨
        int f=1;
        //Sample3 sample = new Sample3(); 원래는써야하지만 위에 생성해놨으므로 생략
        f=sample.varTest2(f);
        System.out.println(f);
	}

}
