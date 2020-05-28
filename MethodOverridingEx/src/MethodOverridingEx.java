//Shape�� draw() �޼ҵ带 Line, Rect, Circle Ŭ�������� 
//������ �°� �������̵� �ϴ� ������
class Shape {		//����Ŭ����
	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape{
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}  
public class MethodOverridingEx {
	static void paint (Shape p) {
		p.draw();	//p�� ����Ű�� ��ü���� �������̵��� draw()ȣ��. �������ε�
	}
	public static void main(String[] args) {
		Line line = new Line();
		//���� ȣ����� ��� paint()�޼ҵ� ������ Shape�� ���� ���۷��� p�� ��ĳ���õ�
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());  //Circle�� �������̵��� draw()����
	}

}
