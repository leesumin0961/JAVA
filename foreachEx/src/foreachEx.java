
public class foreachEx {

	enum Week {��, ȭ, ��, ��, ��, ��, ��}
	
	
	//for-each���� Ȱ���ϴ� ���α׷�
	public static void main(String[] args) {

		
		int [] n = {1,2,3,4,5};
		String names[] = {"���" ,"��" ,"�ٳ���" ,"ü��" ,"����" ,"����" };

		int sum = 0;
		//�Ʒ� for-each���� k�� n[0], n[1]...n[4]�� �ݺ�
		for (int k:n) {
			System.out.println(k + " ");	//�ݺ��Ǵ� k�� ���
			sum += k;

		}
		System.out.println("����" + sum);


		//�Ʒ� for-each���� s�� names[0], names[1]...names[5]�ιݺ�

		for (String s:names) 
			System.out.println(s + " ");	//�ݺ��Ǵ� k�� ���
			System.out.println();

		
		//�Ʒ� for-each���� day�� ��ȭ��������� ������ �ݺ�
			
		for (Week day :Week.values()) 
			System.out.println(day + "���� ");	//�ݺ��Ǵ� k�� ���
			System.out.println();

	}
}
