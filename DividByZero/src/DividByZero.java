import java.util.Scanner;

//�� ������ �Է¹޾� �������� �ϰ� ���� ���ϴ� ���α׷�.
//����ڰ� ������ ���� 0�� �Է��ϸ� ArithmeticException���ܰ� �߻��Ͽ� ���α׷� ��������.
public class DividByZero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dividend; //������
		int divisor; //������
		
		System.out.println("�������� �Է��Ͻÿ�:");
		dividend = scanner.nextInt();
		
		System.out.println("�������� �Է��Ͻÿ�:");
		divisor = scanner.nextInt();
		
		System.out.println(dividend + "�� " +  divisor + "�� ������ ����" + dividend/divisor + "�Դϴ�." );
		
		
	}

}
