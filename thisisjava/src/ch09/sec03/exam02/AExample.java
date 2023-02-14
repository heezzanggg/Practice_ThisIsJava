package ch09.sec03.exam02;

public class AExample {
    public static void main(String[] args) {
        // B객체 생성 및 인스턴스 필드 및 메소드 사용
        A.B b = new A.B(); // "B-생성자 실행"
        System.out.println(b.field1); // 1
        b.method1(); // B-method1 실행

        // B클래스의 정적 필드 및 메소드 사용
        System.out.println(A.B.field2); // 2
        A.B.method2(); // B-method2 실행
    }
}
