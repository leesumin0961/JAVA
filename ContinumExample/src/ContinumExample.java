import java.util.Scanner;

public class ContinumExample {

	//5���� ������ �Է¹ް� �� �� ����鸸 ���Ͽ� ����ϴ� ���α׷�
	//�Էµ� ���� 0�̳� �����̸� continue���� �̿��Ͽ� �������ʰ� ���� �ݺ����� �Ѿ��.
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("���� 5���� �Է��ϼ���.");
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int n =scanner.nextInt();
			if(n <= 0)
				continue;	//����� �ƴ� ��� ���� �ݺ���������
			else
				sum += n;	//����� ��� ����
				
		}
		System.out.println("����� ����" +  sum);
		
	}

}
