
public class LogicalOperator {
	
	public static void main(String[] args) {
	//�񱳿����ڿ� ��������
	//�񱳿����ڿ� �� �����ڸ� �����Ͽ� ����� �� �ִ�. age, c, x, y�� ��� ������ �� �����Ͽ� ����ϴ� ���� ������ ����.

	int age = 20;
	char c = 'A';
	int x = 0;
	int y = 50;
	
	System.out.println((age >= 20) && (age < 30));		//���� (int age)�� 20���ΰ��
	System.out.println((c >= 'A') && (c <= 'Z'));		//����(char c)�� �빮���� ���
	System.out.println((x>=0) && (y>=0) && (y<=50) && (y<=50)); 	//(x,y)�� (0,0)�� (50,50)�� �簢�� ���� ����
		
		
	//������ ���°��
	// 20 <= age < 30	//����������.
	
	//�񱳿����ڿ� �� �������� ���
	//�񱳿���
	System.out.println('a'>'b');
	System.out.println(3 >= 2);
	System.out.println(-1 < 0);
	System.out.println(3.45 <= 2);
	System.out.println(3 == 2);
	System.out.println(3 != 2);
	System.out.println(!(3 != 2));
	
	//�񱳿���� ������ ����
	System.out.println((3 > 2) && (3 > 4));
	System.out.println((3 != 2) || (-1 > 0));
	
	}
}
