//게임에서 무기를 표현하는 weapon클래스를 만들고 살상능력을 리턴하는 fire()메소드를 작성한다.
//fire()은 1을 리턴한다.
//대포를 구현하기 위해 Weapon을 상속받는 Cannon 클래스를 작성. Cannon은 살상능력이 10이다.
//fire() 메소드를 이에 맞게 오버라이딩. main()을 작성해 오버라이딩 테스트

class Cannon extends Weapon{

	@Override
	protected int fire() {	//오버라이딩
		return 10;	//대포는 한번에 10명을 살상
	}
}


public class Overriding {

	public static void main(String[] args) {
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("기본 무기의 살상 능력은" + weapon.fire());

		
		weapon = new Cannon();
		System.out.println("대포의 살상 능력은" + weapon.fire());
		
	}

}
