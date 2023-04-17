package ch07_Inheritance.test.exam06;

public class Child extends Parent {
    public int studentNo;

    public Child(String name, int studentNo) {
        super(name);
        this.studentNo = studentNo;
    }
}

// 부모 클래스에서 생성자 기본생성자 x
// 부모클래스에 파라미터있는 생성자가있을경우 상속받는 자식클래스의 생성자에 super(); 사용해야함