public class DoWhileSample {

	//do-while���� �̿��� a����z���� ����ϴ� ���α׷�
	public static void main(String[] args) {
		char c= 'a';

		do {
			System.out.println(c);
			c = (char) (c+1);	//������ ��� 1�� ���ϸ� ���� ������ �ڵ� ��
		} while (c <= 'z');
	}

}
