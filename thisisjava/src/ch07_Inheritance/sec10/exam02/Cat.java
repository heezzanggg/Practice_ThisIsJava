package ch07_Inheritance.sec10.exam02;

public class Cat extends Animal {
    // 추상메소드 재정의(오버라이딩)
    @Override
    public void sound() {
        System.out.println("냐옹");
    }
}
