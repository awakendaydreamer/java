public class Casting03 {
	public static void main(String[] args) {
		//String 클래스를 이용해 문자 10(su1)과 20(su2)을 더하기 연산을 할 수 있을까?
		String su1 = "10";
		String su2 = "20";
		System.out.println(su1 + su2);	//출력값 : 1020
		
		int a = Integer.parseInt(su1);	//a 변수에는 정수 10이 기억 ▶ Wrapper Class
		int b = Integer.parseInt(su2);	//b 변수에는 정수 20이 기억 ▶ Wrapper Class
		System.out.println(a + b);	//출력값 : 30
		//----------------------------------------
		String su3 = "10.5";
		String su4 = "20";
		System.out.println(su3 + su4);	//출력값 : 10.520.3
		
		double c = Double.parseDouble(su3);
		double d = Double.parseDouble(su4);
		System.out.println(c + d);
		System.out.println(Double.parseDouble(su3) + Double.parseDouble(su4));
		
		float x = Float.parseFloat(su3);
		float y =  Float.parseFloat(su4);
		System.out.println(x + y);
		System.out.println(Float.parseFloat(su3) + Float.parseFloat(su4));
	}//main()
}//class
