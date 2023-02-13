package ch07.sec08.exam02;

public class DriverExample {
    public static void main(String[] args){
        //Driver 객체생성
        Driver driver = new Driver();

        //매개값으로 Bus 객체 재공하고 driver()메소드 호출
        Bus bus = new Bus();
        driver.driver(bus); //driver.driver(new Bus());와 동일

        //매개값으로 Taxi 객체 재공하고 driver()메소드 호출
        Taxi taxi = new Taxi();
        driver.driver(taxi); //driver.driver(new Taxi());와 동일
    }
}
