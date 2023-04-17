package ch06_Class.sec07.exam05;

public class Car {

    // 필드선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    // 생성자
    Car(String model) { // 생성자1
        this(model, "은색", 250);
    }

    Car(String model, String color) { // 생성자2
        this(model, color, 250);
    }

    Car(String model, String color, int maxSpeed) {// 생성자3
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
