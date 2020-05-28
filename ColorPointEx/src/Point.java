//(x,y)�� �� ���� ǥ���ϴ� Point Ŭ������ �̸� ��ӹ޾� ���� �������� 
//ǥ���ϴ� ColorPoint Ŭ������ ����� Ȱ������.
class Point {
	private int x,y;	//������ �����ϴ� x,y ��ǥ
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showPoint() {	//���� ��ǥ ���
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point{	//Point�� ��ӹ��� ColorPoint ����
	private String color;	//���� ��
	
	public void setColor (String color) {
		this.color = color;
	}

	public void showColorPoint() {	//�÷� ���� ��ǥ ���
		System.out.println(color);
		showPoint();			//PointŬ������ showPoint() ȣ��
	}

	public class ColorPointEx{
		public void main(String [] args) {
			Point p = new Point();	//Point ��ü ����
			p.set(1,2);	//Point Ŭ������ set() ȣ��
			p.showPoint();

			ColorPoint cp = new ColorPoint();	//ColorPoint��ü ����
			cp.set(3, 4);						//Point Ŭ������ set() ȣ��
			cp.setColor("red");					//ColorPoint Ŭ������ setColor() ȣ��
			cp.showColorPoint();				//�÷��� ��ǥ ���
		}
	}
}
