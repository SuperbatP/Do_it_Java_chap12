package sec01_abstractclass.EX02;
//추상 클래스의 객체 생성 방법 -익명 이너 클래스 사용
abstract class A{
	abstract void abc();
}

public class AbustractClass_2 {
public static void main(String[] args) {
	A a1=new A() {void abc(){System.out.println("방법2. 익명 이너 클래스 방법으로 객체 생성");}
	};//중괄호와 세미콜론 위치 주의
	
	A a2=new A() {void abc(){System.out.println("방법2. 익명 이너 클래스 방법으로 객체 생성");}
	};//객체를 생성할 때마다 오버라이딩 필요.->하나만 객체 생성이 필요하면 익명 이너클래스 방법 사용/ 많이 필요하면 자식 클래스 사용
a1.abc();
a2.abc();

}
}
