public class Variable02 {
	public static void main(String[] args) {
		//������ ���� a, b�� �����ϰ� ���� 10�� 20�� �Ҵ��Ͻÿ�.
		int a =10, b = 20;
		
		//���� a�� b�ǰ��� ����ϰ�, a�� b�� ���Ͽ� ����Ͻÿ�.
		System.out.println("a�� �� : " + a);
		System.out.println("b�� �� : " + b);
		System.out.println("a�� b�� �� : " + a * b);
		
		//a�� 30, b�� 40�� ���Ҵ� �Ͻÿ�.
		a = 30;	//a�� ���� 10���� 30���� ����(���Ҵ�)
		b = 40;	//b�� ���� 20���� 40���� ����(���Ҵ�)
		
		//���� a�� b�ǰ��� ����ϰ�, a�� b�� ���� ���ؼ� hap �̶�� ������ �Ҵ��ϰ� ���
		System.out.println("a�� �� : " + a);
		System.out.println("b�� �� : " + b);
		int hap = a + b;
		System.out.println("a�� b�� �� : " + hap);
		System.out.println("a�� b�� �� : " + (a + b));
	}//main()
}//class