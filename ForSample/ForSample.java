package Test02;

public class ForSample {

	public static void main(String[] args) {
	
		//for������ 1���� 100������ �� ���ϱ� 
		int sum = 0;
		
		for (int i =1; i <= 10; i++) {		//1~10���� �ݺ�
			sum += i;
			System.out.println(i);			//���ϴ¼� ���
			
			if(i<=9)						//1~9������ +���
				System.out.println("+");
			else {							//i�� 10�ΰ��
				System.out.println("=");	//=�� ����ϰ�
				System.out.println(sum);	//���� ��� ���
			}
			
		}
		
		
	}

}
