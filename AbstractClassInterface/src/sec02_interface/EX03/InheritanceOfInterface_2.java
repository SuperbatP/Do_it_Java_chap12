package sec02_interface.EX03;
//오버라이딩 할 때 접근지정자는 같거나 커야한다.

interface A{
	public abstract void abc(); 
}

interface B{
	void bcd();
}

class C implements A{
	@Override
	public void abc() {//interface A의 접근지정자는 public	
	}
}

/*
 * class D implements B{ void bcd() {}//오류. interface B의 접근지정자는 public/ void는
 * default }
 */

public class InheritanceOfInterface_2 {

}
