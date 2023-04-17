package ch06_Class.sec14;

public class CarExample {
    public static void main(String[] args) {
        // 객체생성
        Car myCar = new Car();

        // 잘못된 속도 변경
        myCar.setSpeed(-90);
        System.out.println("현재속도:" + myCar.getSpeed());

        // 올바른 속도 변경
        myCar.setSpeed(60);
        System.out.println("현재속도:" + myCar.getSpeed());

        System.out.println(myCar.isStop());// false

        // 멈춤
        if (!myCar.isStop()) {
            myCar.setStop(true);
        }
        System.out.println("현재속도:" + myCar.getSpeed());

    }
}
