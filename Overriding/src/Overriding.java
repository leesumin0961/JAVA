//���ӿ��� ���⸦ ǥ���ϴ� weaponŬ������ ����� ���ɷ��� �����ϴ� fire()�޼ҵ带 �ۼ��Ѵ�.
//fire()�� 1�� �����Ѵ�.
//������ �����ϱ� ���� Weapon�� ��ӹ޴� Cannon Ŭ������ �ۼ�. Cannon�� ���ɷ��� 10�̴�.
//fire() �޼ҵ带 �̿� �°� �������̵�. main()�� �ۼ��� �������̵� �׽�Ʈ

class Cannon extends Weapon{

	@Override
	protected int fire() {	//�������̵�
		return 10;	//������ �ѹ��� 10���� ���
	}
}


public class Overriding {

	public static void main(String[] args) {
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("�⺻ ������ ��� �ɷ���" + weapon.fire());

		
		weapon = new Cannon();
		System.out.println("������ ��� �ɷ���" + weapon.fire());
		
	}

}
