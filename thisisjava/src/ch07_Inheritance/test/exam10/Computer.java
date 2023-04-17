package ch07_Inheritance.test.exam10;

//public class Computer extends Machine{
//
//}
//
////부모클래스에 있는 추상메소드를 재정의하지않아서 오류 발생
////만약, 재정의 하지 않으면 자식클래스도 추상클래스로 선언해야함!

public class Computer extends Machine {
    @Override
    public void work() {
        System.out.println("부모클래스에 추상메소드있으면 자식클래스에서 재정의해야되요");
    }
}