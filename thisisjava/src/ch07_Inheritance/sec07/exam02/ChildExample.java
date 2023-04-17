package ch07_Inheritance.sec07.exam02;

//부모타입으로 자동 타입 변환된 이후에는 부모 클래스에 선언된 필드와 메소드만 접근 가능
//but, 자식 클래스에서 오버라이딩된 메소드가 있다면 부모 메소드 대신 오버라이딩 된 메소드가 호출됨
public class ChildExample {
    public static void main(String[] args) {
        // 자식객체생성
        Child child = new Child();
        // 브모타입으로 자동타입변환
        Parent parent = child;

        // 메소드 호출
        parent.method1();
        parent.method2();
        // parent.method3();//부모타입으로 자동 타입 변환된 이후에는 부모 클래스에 선언된 필드와 메소드만 접근 가능
    }
}
