package ch07_Inheritance.sec08.exam02;

public class Taxi extends Vehicle {
    // 메소드 재정의(오버라이딩)
    @Override
    public void run() {
        System.out.println("택시 달린다");
    }
}
