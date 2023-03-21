package ch09.sec02_instanceMemberClass.exam01;

//인스턴스 멤버 클래스 : A클래스의 멤버로 선언된 B클래스
public class AExample {
    public static void main(String[] args) {
        // A 객체 생성
        A a = new A();

        // A의 인스턴스 멤버 클래스인 B 객체 생성
        A.B b = a.new B();

    }

}