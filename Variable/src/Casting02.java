public class Casting02 {
	public static void main(String[] args) {
		/*
		  �� �ڷ� �� ��ȯ ��Ģ
		  ===UpCasting(�ڵ� �� ��ȯ, ���θ��, ������ �� ��ȯ)====>
		  byte(1) �� short(2) �� int(4) �� long(8)  �� float(4) �� double(8)
		                 char(2) ��
		  <====DownCasting(����� �� ��ȯ, �Ϲ����� Casting)====
		              �� �����߻�(������ å��)
		*/
		/*
		  �Ʒ��� ����� �� ���� �� ��ȯ�� �߻��ϴ°�?
		  double num = 3.5f + 12;
		  
		  �� 3.5f + 12.0f
		  �� double num = 15.5f
		*/
		char upper = 'A';
		char lower = 'a';
		
		System.out.println(upper);
		System.out.println(lower);
		
		System.out.println((int)upper);
		System.out.println((int)lower);
		
		//�빮��(up) A�� �ҹ���(down) a�� �ٲ㼭 ����Ͻÿ�.
		char up = 'A';
		int down = (int)up + 32;
		System.out.println((char)down);
		
		System.out.println((char)(up+32));
		
	}//main()
}//class