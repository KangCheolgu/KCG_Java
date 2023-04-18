package ch03.sec11;

public class EqualPrac {

	public static void main(String[] args) {
		
		String a = "abc";
		String b = new String("abc"); //new 를 붙이면 별도의 메모리 공간을 만들어라 라는 뜻
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b)); // new를 안붙이면 똑같이 나옴 문자열의 위치(메모리주소)를 저장
		
		//==는 위치를 비교하고 equals는 값을 비교한다.
		int c = 5;
	}

}
