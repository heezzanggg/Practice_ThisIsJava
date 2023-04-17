package ch07_Inheritance.sec10.exam02;

public class AbstractMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        // 매개변수의 다형성
        animalSound(new Dog());
        animalSound(new Cat());
    }

    public static void animalSound(Animal animal) {
        // animalSound(new Dog()) & animalSound(new Cat()); 자동 타입 변환
        animal.sound(); // 재정의 된 메소드 호출
    }
}
