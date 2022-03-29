package day2;

public class Sample1 {

	public static void main(String[] args) {
		// int 배열로 표현
		int[] odds = {1,2,3,4,5};
		
		// String 배열로 표현
		String[] weeks = {"월","화","수","목"};
		
		for(int i=0; i<weeks.length; i++) {
			System.out.println(weeks[i]);
		}
		
		// String 배열 이런식으로 표현도 가능(대신 반드시 길이에 대한 숫자값필요)
		String[] weeks2 = new String[4];
		weeks[0] = "월";
		weeks[1] = "화";
		weeks[2] = "수";
		weeks[3] = "목";
		
		System.out.println(weeks[1]);
		
		
	}

}
