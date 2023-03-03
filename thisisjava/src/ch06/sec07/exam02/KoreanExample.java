package ch06.sec07.exam02;

//필드초기화
//객체마다 동일 한 값 => 필드 선언 시 초기값 대입해서 필드 초기화
//객체마다 다른 값 => 생성자에서 필드 초기화
public class KoreanExample {

    public static void main(String[] args) {

        // 객체생성
        Korean k1 = new Korean("박자바", "011225-1234567");

        System.out.println("k1.nation" + k1.nation);
        System.out.println("k1.name" + k1.name);
        System.out.println("k1.ssn" + k1.ssn);

        Korean k2 = new Korean("김자바", "930525-0654321");

        System.out.println("k1.nation" + k2.nation);
        System.out.println("k1.name" + k2.name);
        System.out.println("k1.ssn" + k2.ssn);
    }
}
