public class Casting01 {
	public static void main(String[] args) {
	/*
	  Casting(형변환) : 데이터 크기를 변환하는 과정
	                          형변환을 했을때 데이터의 손실(손상)이 없을때만 사용
	                          문제발생 → 개발자의 책임
      ① UpCasting : 자동으로 형변환 되는 경우(작은수 → 큰수) ▶ 프로모션
      ② DownCasting : 강제로 형변환 되는 경우(큰수 → 작은수) ▶ 일반적인 의미의 Casting 
	*/
		int a = 20;	//정수형 변수 a를 선언하고 값(20)을 할당 한 상태 ▶ 초기화
		float b;	//실수형 변수 b를 선언만 한 상태
		b = a;	//변수 a의 값을 변수 b에 할당
		            // → 자동형변환(프로모션) : 작은타입이 큰타입으로 자동으로 변환 ▶ UpCasting
		System.out.println("변수 a : " + a);
		System.out.println("변수 b : " + b);
		
		int c;	//정수형 변수 c를 선언만 한 상태
		float d = 34.5F;	//실수형 변수 d를 선언과 할당을 한 상태 ▶ 초기화
		//c = d;	//오류 : 큰타입을 작은타입에 할당
		c = (int)d;	//강제로 형 변환(float → int) ▶ DownCasting
		System.out.println("변수 c : " + c);	//출력값 : 34 → 0.5의 손실발생
		System.out.println("변수 d : " + d);	//출력값 : 34.5
		
		int x = 128;
		byte y = (byte)x;	//DownCasting
		System.out.println("변수 y : " + y);	//출력값 : -128 ▶ 심각한 문제
		
		char i = 'A';
		int j = i;	//UpCasting(char → int)
		System.out.println("변수 i : " + i);	//출력값 : A
		System.out.println("변수 j : " + j);	//출력값 : 65 → ASCII Code 값
		int k = j + 1;
		System.out.println("변수 k : " + k);	//출력값 : 66
		System.out.println("DownCasting : " + (char)k);	//출력값 : B
		
		String s1 = "12";	//사용자정의 데이터 형(String Class) s1을 선언하고 값을 할당 : 문자열
		String s2 = "12";
		System.out.println(s1 + s2);	//출력값 : 1212 → Concatenation : 문자열연쇄(결합, 연결)
		int hap = Integer.parseInt(s1) + Integer.parseInt(s2);	//Wrapper Class
		System.out.println(hap);	//출력값 : 24
		System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));
	}//main()
}//class