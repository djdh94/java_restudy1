package day1;

public class Sample10 {

	public static void main(String[] args) {
		// 숫자 바로대입
		// %d는 정수를 대입
		System.out.println(String.format("I eat %d apples.", 3));

		// 문자열 바로 대입
		// %s는 문자를 대입
		System.out.println(String.format("I eat %s apple.", "five"));
		
		// 숫자 값을 나타내는 변수로 대입
		int number=3;
		System.out.println(String.format("I eat %d apple.", number));
		
		// 2개 이상의 값 넣기
		int number2=10;
		String day="three";
		System.out.println(String.format("I eat %d %s apple.", number2,day));
		
		// 포맷팅에서 %따로 쓰는법
		System.out.println(String.format("I %d%%", 3));
		
		// 정렬과공백(전체 길이가 10개인 문자열 공간에서 대입되는 값을 오른쪽정렬하고 나머지는 공백
		System.out.println(String.format("%10s", "hi"));
		System.out.println(String.format("%-10s", "hi"));
		
		// 소수점표현하기
		System.out.println(String.format("%.4f", 1.51818));
		System.out.println(String.format("%10.4f", 2.1596198)); //앞에 열칸 뜀
		
		// System.out.printf
		// printf는 String.format 안써줘도됨
		System.out.println(String.format("I eat %d apple.", 3));
		System.out.printf("I eat %d apple.", 3);
	}

}
