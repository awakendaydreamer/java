public class Variable03 {
	public static void main(String[] args) {
		//정수형 데이터 타입(byte, short, int, long)
		byte b = 10;	//1Byte(-128 ~ 127)
		System.out.println("변수 b : " + b);
		
		short s = 1000;	//2Byte(-32,768 ~ 32,767)
		System.out.println("변수 s : " + s);
		
		int i = 100000;	//4Byte(-2,147,483,678 ~ 2,147,483,677)
		System.out.println("변수 i : " + i);
		
		long l = 1234567891234L;	//8Byte
		System.out.println("변수 l : " + l);
	}//main()
}//class