package ch07.sec07.exam03;


public class ChildExample {
    public static void main(String[] args){
        //객체생성 및 자동 타입 변환
        Parent parent = new Child();

        //Parent타입으로 필드,메소드 사용
        parent.field1 = "data1";
        parent.method1();
        parent.method2();

        /*
        parent.field2="data2"; //불가
        parent.method3(); //불가
         */

        //강제타입변환
        Child child = (Child) parent;

        //Child타입으로 필드와 메소드 사용
        child.field2 = "data2";
        child.method3();
    }
}
