public class Variable03 {
	public static void main(String[] args) {
		//������ ������ Ÿ��(byte, short, int, long)
		byte b = 10;	//1Byte(-128 ~ 127)
		System.out.println("���� b : " + b);
		
		short s = 1000;	//2Byte(-32,768 ~ 32,767)
		System.out.println("���� s : " + s);
		
		int i = 100000;	//4Byte(-2,147,483,678 ~ 2,147,483,677)
		System.out.println("���� i : " + i);
		
		long l = 1234567891234L;	//8Byte
		System.out.println("���� l : " + l);
	}//main()
}//class