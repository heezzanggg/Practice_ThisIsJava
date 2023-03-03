package ch06.sec07.exam04;

public class CarExample {
    // 생성자 오버로딩 : 매개변수의 타입,개수,순서가 다르게해서 생성자를 여러개 선언하는것
    // 생성자가 오버로딩 되어이을 경우, new 연산자로 생성자를 호출할 때 제공되는 매개값의 타입과 수에 따라 실행될 생성자가 결정됨
    public static void main(String[] args) {
        Car car1 = new Car(); // 생성자1 호출
        System.out.println("car1.company:" + car1.company);
        System.out.println();

        Car car2 = new Car("자가용"); // 생성자2 호출
        System.out.println("car2.company" + car2.company);
        System.out.println("car2.model" + car2.model);
        System.out.println();

        Car car3 = new Car("자가용", "빨강"); // 생성자3 호출
        System.out.println("car3.company" + car3.company);
        System.out.println("car3.model" + car3.model);
        System.out.println("car3.color" + car3.color);
        System.out.println();

        Car car4 = new Car("택시", "검정", 200); // 생성자4 호출
        System.out.println("car4.company" + car4.company);
        System.out.println("car4.model" + car4.model);
        System.out.println("car4.color" + car4.color);
        System.out.println("car4.maxSpeed" + car4.maxSpeed);
    }
}
