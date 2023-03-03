package ch06.sec08.exam01;

public class CalculatorExample {
    // 메소드 호출
    // 외부객체에서는 객체 생성 후 참조 변수와 도트 연산자 이용해서 호출
    public static void main(String[] args) {

        // Calculator 객체 생성
        Calculator myCal = new Calculator();

        // 리턴값이 없는 powerOn() 메소드 호출
        myCal.powerOn();

        // plus 메소드호출시 5,6을 매개값으로 제공
        // 덧셈 결과를 리턴 받아 result1 변수에 대입
        int result1 = myCal.plus(5, 6);
        System.out.println(result1);

        int x = 10;
        int y = 4;

        // divide()메소드 호출 시 변수 x,y의 값을 매개값으로 제공하고
        // 나눗셈 결과를 리턴받아 result2의 변수에 대입

        double result2 = myCal.divide(x, y);
        System.out.println(result2);

        // 리턴값 없는 powerOff() 메소드 호출
        myCal.powerOff();
    }

}
