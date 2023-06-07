package sec02_interface.EX07;

interface A{
	default void abc() {System.out.println("A 인터페이스의 abc()");}
}

class B implements A{
	public void abc() {
		A.super.abc();//부모 A interface에서 abc() 메서드 호출 /super만 쓸 경우 부모 class 것 호출
		System.out.println("B 클래스의 abc()");
	}
}

public class DefaultMethod_2 {
public static void main(String[] args) {
	B b= new B();
	b.abc();
}
}
