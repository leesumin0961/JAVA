
//1.추상 메소드를 포함하는 클래스
abstract class Shape{	//추상클래스 선언
	public Shape()	{}
	public void paint() {draw();}
	protected abstract void draw();	//추상메소드 선언
	
}

//2.추상 메소드가 없지만 abstract로 선언한 클래스
abstract class Mycomponent{
	String name;
	public void load(String name) {
		this.name = name;
	}
}

//*****->추상클래스는 추상메소드를 가지고 있지않으면 반드시 추상 클래스로 선언해야 한다.*****


//추상클래스의 상속
abstract class Abstract {	//추상 클래스
	public Abstract() {}
	public void paint() { draw(); }  //추상 메소드
	abstract public void draw();
}

abstract class Line extends Abstract{	//추상 클래스. Draw()를 상속받기 때문
	public String toString() {
		return "Line";
		}
}




