package sec02_interface.EX01;

interface A{
	public static final int a=3;
	public abstract void abc();
}

interface B{
	int b=3;//interface 에서는 무조건 public static final이므로 자동 컴파일
	void bdc();//interface 에서는 무조건 public abstract이므로 자동 컴파일
}

public class InterfaceCharacteristics {
public static void main(String[] args) {
	//static 자동 추가 확인
	System.out.println(A.a);
	System.out.println(B.b);
	
	//final 자동 추가 확인
	//A.a=5; 불가능
	//B.b=5; 불가능
}


}
