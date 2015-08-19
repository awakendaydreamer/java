public class Casting01 {
	public static void main(String[] args) {
	/*
	  Casting(����ȯ) : ������ ũ�⸦ ��ȯ�ϴ� ����
	                          ����ȯ�� ������ �������� �ս�(�ջ�)�� �������� ���
	                          �����߻� �� �������� å��
      �� UpCasting : �ڵ����� ����ȯ �Ǵ� ���(������ �� ū��) �� ���θ��
      �� DownCasting : ������ ����ȯ �Ǵ� ���(ū�� �� ������) �� �Ϲ����� �ǹ��� Casting 
	*/
		int a = 20;	//������ ���� a�� �����ϰ� ��(20)�� �Ҵ� �� ���� �� �ʱ�ȭ
		float b;	//�Ǽ��� ���� b�� ���� �� ����
		b = a;	//���� a�� ���� ���� b�� �Ҵ�
		            // �� �ڵ�����ȯ(���θ��) : ����Ÿ���� ūŸ������ �ڵ����� ��ȯ �� UpCasting
		System.out.println("���� a : " + a);
		System.out.println("���� b : " + b);
		
		int c;	//������ ���� c�� ���� �� ����
		float d = 34.5F;	//�Ǽ��� ���� d�� ����� �Ҵ��� �� ���� �� �ʱ�ȭ
		//c = d;	//���� : ūŸ���� ����Ÿ�Կ� �Ҵ�
		c = (int)d;	//������ �� ��ȯ(float �� int) �� DownCasting
		System.out.println("���� c : " + c);	//��°� : 34 �� 0.5�� �սǹ߻�
		System.out.println("���� d : " + d);	//��°� : 34.5
		
		int x = 128;
		byte y = (byte)x;	//DownCasting
		System.out.println("���� y : " + y);	//��°� : -128 �� �ɰ��� ����
		
		char i = 'A';
		int j = i;	//UpCasting(char �� int)
		System.out.println("���� i : " + i);	//��°� : A
		System.out.println("���� j : " + j);	//��°� : 65 �� ASCII Code ��
		int k = j + 1;
		System.out.println("���� k : " + k);	//��°� : 66
		System.out.println("DownCasting : " + (char)k);	//��°� : B
		
		String s1 = "12";	//��������� ������ ��(String Class) s1�� �����ϰ� ���� �Ҵ� : ���ڿ�
		String s2 = "12";
		System.out.println(s1 + s2);	//��°� : 1212 �� Concatenation : ���ڿ�����(����, ����)
		int hap = Integer.parseInt(s1) + Integer.parseInt(s2);	//Wrapper Class
		System.out.println(hap);	//��°� : 24
		System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));
	}//main()
}//class