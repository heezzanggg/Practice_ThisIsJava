package ch06_Class.sec11.exam01;

public class KoreanExample {
    public static void main(String[] args) {
        // 객체생성시 주민등록번호와 이름 전달
        Korean k1 = new Korean("123456-1234567", "김자바");

        // 필드값읽기
        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        // final 필드는 값 변경 불가
        // k1.ssn = "123-12-1234";
        // k1.nation = "USA";

        k1.name = "박자바";
        System.out.println("비 final 필드는 값 변경 가능: " + k1.name);
    }
}
