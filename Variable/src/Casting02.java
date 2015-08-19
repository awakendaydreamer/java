public class Casting02 {
	public static void main(String[] args) {
		/*
		  ※ 자료 형 변환 규칙
		  ===UpCasting(자동 형 변환, 프로모션, 묵시적 형 변환)====>
		  byte(1) → short(2) → int(4) → long(8)  → float(4) → double(8)
		                 char(2) ↗
		  <====DownCasting(명시적 형 변환, 일반적인 Casting)====
		              ▶ 문제발생(개발자 책임)
		*/
		/*
		  아래의 명령은 몇 번의 형 변환이 발생하는가?
		  double num = 3.5f + 12;
		  
		  ① 3.5f + 12.0f
		  ② double num = 15.5f
		*/
		char upper = 'A';
		char lower = 'a';
		
		System.out.println(upper);
		System.out.println(lower);
		
		System.out.println((int)upper);
		System.out.println((int)lower);
		
		//대문자(up) A를 소문자(down) a로 바꿔서 출력하시오.
		char up = 'A';
		int down = (int)up + 32;
		System.out.println((char)down);
		
		System.out.println((char)(up+32));
		
	}//main()
}//class