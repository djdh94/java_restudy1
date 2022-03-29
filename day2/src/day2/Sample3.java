package day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Sample3 {

	public static void main(String[] args) {
		
		//Map => key,value값 가짐,
		//"사람"을 예로 들면 누구든지 "이름" = "홍길동", "생일" = "몇 월 며칠" 등으로 구분할 수 있다. 
		//자바의 맵(Map)은 이러한 대응관계를 쉽게 표현할 수 있게 해 주는 자료형이다.
		
		
		//HashMap = 해쉬맵또한 제네릭스를 이용
		HashMap<String,String>map = new HashMap<>();
		// 1. put=> 이용해 입력
		map.put("people", "사람");
		map.put("baseball", "야구");
		// 2. get=> value값 추출
		System.out.println(map.get("people"));
		// 3. containskey=> 해당키가 있는지 확인후 결과값을 true,false로 리턴
		System.out.println(map.containsKey("people"));
		// 4. remove=>삭제후 리턴
		System.out.println(map.remove("people"));
		// 5. size=>갯수리턴 
		System.out.println(map.size());
		// 6. keyset => 맵의 모든 key를 모아서 리턴
		System.out.println(map.keySet());
		
		// Set 자료형은 다음과 같이 List자료형으로 바꾸어 사용가능
		List<String> keyList = new ArrayList<>(map.keySet());
		System.out.println(keyList);
	}

}
