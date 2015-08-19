public class Variable01 {
	public static void main(String[] args) {
		//정수 2개를 저장할 변수를 선언하시오(변수명은 a, b)
		int a;	//정수형 변수 a를 선언
		int b;	//정수형 변수 b를 선언
		//int a, b;	//같은자료형의 변수를 나열( , 구분)
		
		//변수 a에 10, b에 20을 할당하시오.
		a = 10;	//할당
		b = 20;	//할당
		
		//정수형 변수 c와 d를 선언하고, c에 30, d에 40을 할당하시오.
		int c = 30;	//선언과 동시에 할당 ▶ 초기화
		int d = 40;	//선언돠 동시에 할당 ▶ 초기화
		//int c = 30, d = 40;	//같은 자료형의 변수를 초기화하고 나열
		
		//각각의 변수에 저장된 데이터를 출력
		System.out.println("a의 값 : " + a);
		System.out.println("b의 값 : " + b);
		System.out.println("c의 값 : " + c);
		System.out.println("d의 값 : " + d);
	}//main()
}//class

/*
	JAVA에서 변수명 선언 규칙(Naming Convention)
	  - JAVA는 대소문자를 구분한다.
	  - 첫글자는 반드시 문자, '_', '$'로만 시작된다.
	  - 지정된 단어(Keyword)는 사용할 수 없다.
	  - 변수의 이름은 소문자로 시작하고, 단어와 단어를 이어서 의미를
	    주고자 할 때에는 '_'를 이용하거나, 연결되는 단어의 첫글자를 대문자 표시
	    (예 : sum_result, totalCount, xPosition, salePrice 등)
	  - 변수의 이름은 가능하면 의미를 알아볼 수 있는 이름으로 사용
	    (예 : userId, userPw, grade 등)
*/








