import java.util.Scanner;

public class WhileSample {

	public static void main(String[] args) {
		
		//while���� �ݺ� Ƚ���� ���� ���ϴ� ��쿡 �̿�ȴٰ� �ߴ�. while���� �̿��Ͽ� -1�� �Էµ� �� ���� ������ ���
		//�Է¹޾� ���� ���ϰ� ����� ����ϴ� ���α׷�
		int count = 0;
		int sum = 0;
		
		Scanner scanner =  new Scanner(System.in);
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���.");
		
		int n = scanner.nextInt();
		
		while(n !=1) {
			sum += n;
			count ++;
			n = scanner.nextInt();
		}
		if(count == 0) {
			System.out.println("�Էµ� ���� �����ϴ�.");
		}
		else {
			System.out.println("������ ������" + count +"���̸�");
			System.out.println("�����" + (double)sum/count + "�Դϴ�.");
			}
		scanner.close();
	}

}
