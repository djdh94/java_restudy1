package day1;

public class Sample9 {

	public static void main(String[] args) {
		//equals
		String a="hello";
		String b="java";
		String c="hello";
		System.out.println(a.equals(c));
		System.out.println(a.equals(b));
		
		//index of
		// 문자열에서 특정 문자가 시작되는 위치(인덱스)를 리턴한다.
		// 찾는게없을시에는 -1을 리턴함,대소문자구분함
		String d= new String("Hello java");
		System.out.println(d.indexOf("j"));
		
		//contains
		// 문자열에서 특정 문자열이 포함되어 있는지의 여부를 리턴한다.
		String e = new String("Hello java");
		System.out.println(e.contains("z"));
		
		//charAt
		// 문자열에서 특정 위치의 문자(char)를 리턴한다.
		String f="Hello java";
		System.out.println(f.charAt(1));
		
		//replaceAll
		// 문자열 중 특정 문자열을 다른 문자열로 바꾸고자 할때 사용
		String g = "Hello java";
		System.out.println(g.replace("Hello", "World"));
		
		//substring
		// 문자열 중 특정 부분을 뽑아낼 경우에 사용
		String h="Hello java";
		System.out.println(h.substring(0,7));
		
		//toUpperCase
		// 문자열을 모두 대문자로 변경할때 사용 
		String i="Hello java";
		System.out.println(i.toUpperCase());
		
		//toLowerCase
		// 문자열 모두 소문자로 변경
		String j="HELLO JAVA";
		System.out.println(j.toLowerCase());
		
		//split
		// 문자열을 특정 구분자로 분리하는 메소드
		String k="a:b:c:d";
		String[] result=k.split(":");
	
		
		
	}

}
