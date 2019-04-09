package com.example.api.stringclass;

public class StringEx {

	public static void main(String[] args) {
//		stringBasic();
		methods();
//		stringBufferEx();

	}

	// 문자열의 생성
	private static void stringBasic() {
		// 문자열의 생성
		String s1 = "Java"; // 리터럴
		String s2 = new String("Java"); // 객체 생성
		String s3 = "Java"; // 리터럴

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);

		// 배열을 이용 생성
		char[] letters = {'J', 'a', 'v', 'a'};
		String s4 = new String(letters);
		System.out.println(s4);
		
		// 다른 타입을 문자열로 변환 할당 : String.valueof()
		String s5 = String.valueOf(Math.PI);
		System.out.println(s5);

	}
	// 자주 사용할 만한 메서드
	private static void methods() {
		String str = "Java Programming is Fun?";
		
		// 문자열의 길이 : length()
		System.out.println(str);
		System.out.println("길이: " +str.length());
		
		// 변환 메서드
		System.out.println("대문자로: "+str.toUpperCase());
		System.out.println("소문자로: "+str.toLowerCase());
		
		// 검색 메서드  : index 관련
		System.out.println("5번 index의 문자: "+str.charAt(5));
		System.out.println(str.indexOf("Fun"));
		System.out.println(str.indexOf("fun"));
		// 중요 : 찾는 내용이 없으면 -1
		System.out.println(str.lastIndexOf("Fun")); //검색 방향이 반대
		
		// 문자열 추출
		System.out.println(str.substring(5));
		System.out.println(str.substring(5, 16));
		
		// 문자열 치환
		System.out.println(str.replace('?', '!'));
		System.out.println(str.replaceAll("a", "A"));
		
		// 공백문자 제거 : trim()
		String s1 = "		Hello";
		String s2 = "  , Java";
		System.out.println(s1+s2);
		
		s1 = s1.trim(); // 공백문자 제거
		s2 = s2.trim(); // 공백문자 제거
		System.out.println(s1+s2);
		
		// 문자열 분리 : split()
		String[] chunk = str.split(" ");
		
		for(String value:chunk) {
			System.out.println(value);
		}
		
		// 문자열 비교 : Unicode 값의 비교
		System.out.println("Java".compareTo("Java")); // 완전히 같을 경우 : 0
		System.out.println("Java".compareTo("java"));
		
		
		
	}
	private static void stringBufferEx() {
		// StringBuffer 생성
		StringBuffer sb = new StringBuffer("This");
		// 문자열 추가 : append
		sb.append(" is pencil");
		// 문자열 삽입 : insert(index, 문자열)
		sb.insert(8, "my");
		// 문자열 치환 : replace(beginIndex, endIndex, 문자열)
		sb.replace(8, 10, "your ");
		
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer("This")
				.append(" is pencil")
				.insert(8, "my")
				.replace(8, 10, "your "); // 메서드 체이닝
		System.out.println(sb2);
	}

}
