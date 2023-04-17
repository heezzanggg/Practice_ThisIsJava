package ch06_Class.sec07.exam04;

//생성자 오버로딩 : 매개변수의 타입,개수,순서가 다르게해서 생성자를 여러개 선언하는것
//생성자가 오버로딩 되어이을 경우, new 연산자로 생성자를 호출할 때 제공되는 매개값의 타입과 수에 따라 실행될 생성자가 결정됨
public class Car {
    // 필드선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    // 생성자선언
    Car() {
    } // 생성자1

    Car(String model) { // 생성자2
        this.model = model;
    }

    Car(String model, String color) { // 생성자3
        this.model = model;
        this.color = color;
    }

    Car(String model, String color, int maxSpeed) { // 생성자4
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

}
