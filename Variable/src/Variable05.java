public class Variable05 {
	public static void main(String[] args) {
		//char : 알파벳 글자 하나, 한글 문자 하나를 저장
		//값을 할당할 때는 작은따옴표를 사용한다.
		char a = 'A';
		char b = '가';
		
		System.out.println("변수 a : " + a);
		System.out.println("변수 b : " + b);
		//----------------------------------------------------

		//String : 문자, 문자열을 저장할 수 있는 클래스
		//값을 할당할 때는 쌍따옴표를 사용한다.
		String str1 = "ABC";
		String str2 = "가나다";
		
		System.out.println("변수 str1 : " + str1);
		System.out.println("변수 str2 : " + str2);
		System.out.println(str1 + str2);
		System.out.println(str1 + " " + str2);
		System.out.println(str1 + "\t" + str2);
		System.out.println(str2 + "\t" + str1);
	}//main()
}//class