
//1.�߻� �޼ҵ带 �����ϴ� Ŭ����
abstract class Shape{	//�߻�Ŭ���� ����
	public Shape()	{}
	public void paint() {draw();}
	protected abstract void draw();	//�߻�޼ҵ� ����
	
}

//2.�߻� �޼ҵ尡 ������ abstract�� ������ Ŭ����
abstract class Mycomponent{
	String name;
	public void load(String name) {
		this.name = name;
	}
}

//*****->�߻�Ŭ������ �߻�޼ҵ带 ������ ���������� �ݵ�� �߻� Ŭ������ �����ؾ� �Ѵ�.*****


//�߻�Ŭ������ ���
abstract class Abstract {	//�߻� Ŭ����
	public Abstract() {}
	public void paint() { draw(); }  //�߻� �޼ҵ�
	abstract public void draw();
}

abstract class Line extends Abstract{	//�߻� Ŭ����. Draw()�� ��ӹޱ� ����
	public String toString() {
		return "Line";
		}
}




