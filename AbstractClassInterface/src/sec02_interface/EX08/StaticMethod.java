package sec02_interface.EX08;

interface A{
	static void abc() {System.out.println("A 인터페이스의 정적 메서드 abc()");}
}

public class StaticMethod {
public static void main(String[] args) {
	A.abc();//정적메서드는 객체 할당 없이 바로 사용 가능
}
}
