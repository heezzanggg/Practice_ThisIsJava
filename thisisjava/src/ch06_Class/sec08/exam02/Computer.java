package ch06_Class.sec08.exam02;

public class Computer {
    // 가변길이 매개변수를 갖는 매소드 선언
    // 매개값들은 자동으로 배열 항목으로 변환되어 메소드에서 사용 됨
    int sum(int... values) {
        // sum변수 선언
        int sum = 0;

        // values는 배열 타입의 변수처럼 사용
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        // 합산 결과를 리턴
        return sum;
    }
}
