public class Casting03 {
	public static void main(String[] args) {
		//String Ŭ������ �̿��� ���� 10(su1)�� 20(su2)�� ���ϱ� ������ �� �� ������?
		String su1 = "10";
		String su2 = "20";
		System.out.println(su1 + su2);	//��°� : 1020
		
		int a = Integer.parseInt(su1);	//a �������� ���� 10�� ��� �� Wrapper Class
		int b = Integer.parseInt(su2);	//b �������� ���� 20�� ��� �� Wrapper Class
		System.out.println(a + b);	//��°� : 30
		//----------------------------------------
		String su3 = "10.5";
		String su4 = "20";
		System.out.println(su3 + su4);	//��°� : 10.520.3
		
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
