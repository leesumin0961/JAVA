public class NestedLoop {

	public static void main(String[] args) {
		
		//2�� ��ø for���� ����Ͽ� �������� ����ϴ� ���α׷�
		
		for (int i = 1; i <10; i++) {	//1�ܿ��� 9�� ���
			for (int j = 1; j < 10; j++) {	//�� ���� ������ ���
				System.out.println(i + "*" + j + "=" + i*j);	//������ ���
				System.out.println('\t');	//�ϳ� �� �� �̵�
				
			}
			System.out.println();	//�� ���� ������ ���� �ٷ� Ŀ�� �̵�
			
		}

	}

}
