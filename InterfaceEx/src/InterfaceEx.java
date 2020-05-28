
//자바 인터페이스는 inertface키워드를 사용하여 선언한다.

interface PhonInterface {
	public static final int TIMEOUT =10000;	   //상수필드. public static final생략가능 
	public abstract void sendCall();	   	//추상메소드. public static final생략가능 
	public abstract void reciveCall();	  	//추상메소드. public static final생략가능 
	public default void printLogo() {	  	//default 메소드 public 생략가능
		System.out.println("**phone**");
	};	//디폴트 메소드

}


//인터페이스 구현 -> implements 키워드를 사용하여 인터페이스의 모든 추상 메소드를 구현한 클래스를 작성하는것

class SamsungPhone implements PhonInterface{	//인터페이스 구현

	//PhoneInterface의 모든 메소드 구현

	@Override
	public void sendCall() {
		System.out.println("띠리리링");
	}

	@Override
	public void reciveCall() {
		System.out.println("전화가 왔어용~~~~!!!");

	}

	//메소드 추가작성
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니당.~~~~!!!");

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




//인터페이스 다중구현
interface AIInterface{
	void recognizeSpeech();	//음성인식
	void syntherizeSpeech();	//음성합성
}
interface MobilePhoneInterface{
	void sendCall();	
	void reciveCall();	 
}

class AIPhone implements MobilePhoneInterface,AIInterface{	//인터페이스 구현

	//AIInterface의 모든 메소드를 구현한다.
	@Override
	public void recognizeSpeech() {}
	@Override
	public void syntherizeSpeech() {}

	//PhonInterface의  모든 메소드를 구현한다.
	@Override
	public void sendCall() {}
	@Override
	public void reciveCall() {}

	//추가적으로 다른 메소드를 작성할 수 있다.
	public void thouch() {}
}










