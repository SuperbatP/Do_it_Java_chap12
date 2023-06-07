package sec01_abstractclass.EX01;
//추상 클래스의 객체 생성방법-자식 클래스 활용

abstract class A{
	abstract void abc();
}

class B extends A{
	void abc() {System.out.println("방법1. 자식 클래스 생성 및 추상 메서드 구현");}
}


public class AbstractClass_1 {
public static void main(String[] args) {
	
//	A a1=new A; abstract는 객체 생성불가
	A b1=new B();
	A b2= new B();
	
	b1.abc();
	b2.abc();
	
}
}
