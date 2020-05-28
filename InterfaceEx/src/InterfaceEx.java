
//�ڹ� �������̽��� inertfaceŰ���带 ����Ͽ� �����Ѵ�.

interface PhonInterface {
	public static final int TIMEOUT =10000;	   //����ʵ�. public static final�������� 
	public abstract void sendCall();	   	//�߻�޼ҵ�. public static final�������� 
	public abstract void reciveCall();	  	//�߻�޼ҵ�. public static final�������� 
	public default void printLogo() {	  	//default �޼ҵ� public ��������
		System.out.println("**phone**");
	};	//����Ʈ �޼ҵ�

}


//�������̽� ���� -> implements Ű���带 ����Ͽ� �������̽��� ��� �߻� �޼ҵ带 ������ Ŭ������ �ۼ��ϴ°�

class SamsungPhone implements PhonInterface{	//�������̽� ����

	//PhoneInterface�� ��� �޼ҵ� ����

	@Override
	public void sendCall() {
		System.out.println("�츮����");
	}

	@Override
	public void reciveCall() {
		System.out.println("��ȭ�� �Ծ��~~~~!!!");

	}

	//�޼ҵ� �߰��ۼ�
	public void flash() {
		System.out.println("��ȭ�⿡ ���� �������ϴ�.~~~~!!!");

	}

}

public class InterfaceEx{
	public static void main(String [] arge) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.reciveCall();
		phone.flash();
	}
}




//�������̽� ���߱���
interface AIInterface{
	void recognizeSpeech();	//�����ν�
	void syntherizeSpeech();	//�����ռ�
}
interface MobilePhoneInterface{
	void sendCall();	
	void reciveCall();	 
}

class AIPhone implements MobilePhoneInterface,AIInterface{	//�������̽� ����

	//AIInterface�� ��� �޼ҵ带 �����Ѵ�.
	@Override
	public void recognizeSpeech() {}
	@Override
	public void syntherizeSpeech() {}

	//PhonInterface��  ��� �޼ҵ带 �����Ѵ�.
	@Override
	public void sendCall() {}
	@Override
	public void reciveCall() {}

	//�߰������� �ٸ� �޼ҵ带 �ۼ��� �� �ִ�.
	public void thouch() {}
}










