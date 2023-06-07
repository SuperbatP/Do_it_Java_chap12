package sec02_interface.EX02;

interface A {}
interface B {}

//단일 인터페이스 상소
class C implements A{}

//다중 인터페이스 상속
class D implements A,B{}

//클래스와 인터페스를 한번에 상속(순서 주의 extends-implements)
class E extends D implements A,B{}//클래스는 하나만 가능.

public class InheritanceOfInterface_1 {

}
