package ch07_Inheritance.sec04.exam01;

//메소드재정의(메소드 오버라이딩): 상속된 메소드를 자식 클래스에서 재정의 하는것.
//메소드가 재정의되었다면 자식 메소드가 우선적으로 사용됨.
public class Calculator {
    // 메소드 선언
    public double areaCircle(double r) {
        System.out.println("Calculator 객체의 areaCircle()실행");
        return 3.14159 * r * r;
    }
}
