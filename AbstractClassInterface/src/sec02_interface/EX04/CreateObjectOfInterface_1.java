package sec02_interface.EX04;
//자식클래스를 이용한 객체 생성

interface A{
	int a=3;
	void abc();
}

class B implements A{
	public void abc() {System.out.println("방법1. 자식 클래스 생성자로 객체 생성");}
}

public class CreateObjectOfInterface_1 {
public static void main(String[] args) {
	A b1=new B(); //B b1=new B();도 동일한 결과값
	A b2=new B();
	
	b1.abc();
	b2.abc();
}
}
