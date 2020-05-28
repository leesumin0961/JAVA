//Shape의 draw() 메소드를 Line, Rect, Circle 클래스에서 
//목적에 맞게 오버라이딩 하는 다형성
class Shape {		//슈퍼클래스
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
		p.draw();	//p가 가리키는 객체내에 오버라이딩된 draw()호출. 동적바인딩
	}
	public static void main(String[] args) {
		Line line = new Line();
		//다음 호출들은 모두 paint()메소드 내에서 Shape에 대한 레퍼런스 p로 업캐스팅됨
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());  //Circle에 오버라이딩한 draw()실행
	}

}
