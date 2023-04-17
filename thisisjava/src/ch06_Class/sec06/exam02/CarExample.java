package ch06_Class.sec06.exam02;

public class CarExample {
    public static void main(String[] args) {
        // Car 객체생성
        Car myCar = new Car();

        // Car 객체의 필드값 읽기
        System.out.println(myCar.company);
        System.out.println(myCar.model);
        System.out.println(myCar.color);
        System.out.println(myCar.maxSpeed);
        System.out.println("현재속도" + myCar.speed);

        // Car 객체의 필드값 변경
        myCar.speed = 60;
        System.out.println("수정된속도" + myCar.speed);
    }
}
