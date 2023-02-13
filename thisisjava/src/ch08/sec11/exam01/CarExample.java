package ch08.sec11.exam01;

public class CarExample {
    public static void main(String[] args){
        //자동차객체 생성
        Car myCar = new Car();

        //run()메소드 실행
        myCar.run();
        //한국타이어 굴러감
        //금호타이어 굴러감

        //타이어 객체 교체
        myCar.tire1 = new KumhoTire();
        myCar.tire2 = new HankookTire();

        //run()메소드 실행
        myCar.run();
        //금호타이어 굴러감
        //한국타이어 굴러감
    }
}
