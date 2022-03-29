package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Sample2 {

	public static void main(String[] args) {
		
		ArrayList pitches = new ArrayList();
		pitches.add(138);
		pitches.add("139");
		pitches.add("140");
		
		// 0번쨰 위치에 135 삽입
		pitches.add(0,135);
		
		// 0번쨰 위치 출력
		System.out.println(pitches.get(0));
		
		// Size= ArrayList의 갯수를 보여줌
		System.out.println(pitches.size());
		
		// contains = 리스트안에 해당 항목이 있는지 판별하고 결과를 boolean으로 리턴
		System.out.println(pitches.contains(143));
		
		// remove = 해당항목을 삭제하고 true,false로 리턴
		System.out.println(pitches.remove("139"));
		// remove = 해당항목을 삭제하고 삭제된 항목을 리턴
		System.out.println(pitches.remove(0));
		// 삭제된거 사이즈로 체크해보기
		System.out.println(pitches.size());
		
		// 재네릭스를 사용하지 않은경우
		// 아래와 같이 String 자료형으로 캐스팅(형변환) 해줘야함
		ArrayList pitches2 = new ArrayList();
		pitches2.add("138");
		pitches2.add("140");
		String one = (String) pitches2.get(0);
		String two = (String) pitches2.get(1);
		
		// 재네릭스를 사용하는경우
		ArrayList<String> pitches3 = new ArrayList<>();
		pitches3.add("138");
		pitches3.add("140");
		String one2 =  pitches3.get(0); //형변환 필요없음
		String two2 =  pitches3.get(1); //형변환 필요없음
		
		System.out.println(pitches3);
		
		// 이미 데이터가 존재할경우에 편하게 ArrayList생성가능
		String[] data = {"138","139"};
		ArrayList<String> pitches4 = new ArrayList<>(Arrays.asList(data));
		System.out.println(pitches4);
		
		// 이렇게도 가능
		ArrayList<String> pitches5 = new ArrayList<>(Arrays.asList("138","139"));
		System.out.println(pitches5);
		
		
		// String join 사용하기 (ArrayList의 각 요소를 콤마로 구분하여 하나의 문자열로 만들기)
		ArrayList<String> pitches6 = new ArrayList<>(Arrays.asList("150","160"));
		String result = String.join(",", pitches6);
		System.out.println(result);
		
		// 리스트 정렬하기 = Comparator.reverseOrder(내림차순),Comparator.naturalOrder(오름차순)
		ArrayList<String> pitches7 = new ArrayList<>(Arrays.asList("150","160"));
		
		pitches7.sort(Comparator.reverseOrder());
		System.out.println(pitches7);
		
	}
	

}
