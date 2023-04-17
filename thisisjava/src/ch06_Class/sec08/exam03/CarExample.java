package ch06_Class.sec08.exam03;

public class CarExample {
    public static void main(String[] args) {
        // Car 객체생성
        Car myCar = new Car();

        // 리턴값이 없는 setGas()메소드 호출
        myCar.setGas(5);

        // isLeftGas()메소드 호출해서 받은 리턴값이 true일 경우 if 블록 실행
        if (myCar.isLeftGas()) {
            System.out.println("출발");

            // 리턴값이 없는 run()호출
            myCar.run();
        }
        System.out.println("gas 주입하세요");
    }
}
