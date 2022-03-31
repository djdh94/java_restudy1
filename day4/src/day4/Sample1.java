package day4;

// 객체지향프로그래밍이란?
/*class Calculator {
    static int result = 0;

    static int add(int num) {
        result += num;
        return result;
    }
}
// 계산기 2개 돌림
class Calculator2{
	static int result = 0;

    static int add(int num) {
        result += num;
        return result;
    }
}*/


/*public class Sample1 {
    public static void main(String[] args) {
        System.out.println(Calculator.add(3));
        System.out.println(Calculator.add(4));
        System.out.println(Calculator2.add(7));
        System.out.println(Calculator2.add(3));
    }
}*/

	// 계산기 2대 돌리는거 응용하기
class Calculator {
    int result = 0;

    int add(int num) {
        result += num;
        return result;
    }
}


public class Sample1 {
    public static void main(String[] args) {
        Calculator cal1 = new Calculator();  // 계산기1 객체를 생성한다.
        Calculator cal2 = new Calculator();  // 계산기2 객체를 생성한다.

        System.out.println(cal1.add(3));
        System.out.println(cal1.add(4));

        System.out.println(cal2.add(3));
        System.out.println(cal2.add(7));
    }
}
