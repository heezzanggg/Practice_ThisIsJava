package ch07_Inheritance.test.exam07;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
    }
}

// Parent(String nation) call
// Parent() call
// Child(String name) call
// Child() call

// 왜 기본생성자가 먼저 호출되지않지?????
// --> 사용자정의생성자가 우선인듯...... 가 아니네.....
// 기본생성자의 this(매개변수) 만나서 사용자정의생성자가 불러졌음