public class Variable02 {
	public static void main(String[] args) {
		//정수형 변수 a, b를 선언하고 각각 10과 20을 할당하시오.
		int a =10, b = 20;
		
		//변수 a와 b의값을 출력하고, a와 b를 곱하여 출력하시오.
		System.out.println("a의 값 : " + a);
		System.out.println("b의 값 : " + b);
		System.out.println("a와 b의 곱 : " + a * b);
		
		//a에 30, b에 40을 재할당 하시오.
		a = 30;	//a의 값이 10에서 30으로 변경(재할당)
		b = 40;	//b의 값이 20에서 40으로 변경(재할당)
		
		//변수 a와 b의값을 출력하고, a와 b의 값을 더해서 hap 이라는 변수에 할당하고 출력
		System.out.println("a의 값 : " + a);
		System.out.println("b의 값 : " + b);
		int hap = a + b;
		System.out.println("a와 b의 합 : " + hap);
		System.out.println("a와 b의 합 : " + (a + b));
	}//main()
}//class