package ch07_Inheritance.sec03.exam02;

//자식객체 생성하면 부모객체가 먼저 생성된 다음 자식 객체 생성되고 모든 객체는 생성자를 호출해야만 생성됨
//부모 생성자는 자식 생성자의 맨 첫줄에 숨겨진 super()에 의해 호출됨

//부모클래스가 기본 생성자를 가지고 있는 경우,
//super()는 컴파일 과정에서 자동추가되므로 부모의 기본생성자를 호출하고 자식생성자 선언시 super() 생략 가능!
//But 부모클래스가 매개변수를 갖는 생성자만 있다면,
//자식 생성자 선언시 맨 윗줄에 super()코드 직접 입력 필!
public class SmartPhone extends Phone {
    // 자식생성자 선언
    public SmartPhone(String model, String color) {
        super(model, color); // 부모클래스에 기본 생성자 없으므로 반드시 작성해야함!
        System.out.println("SmartPhone(String model,String color)생성자 실행");
    }
}
