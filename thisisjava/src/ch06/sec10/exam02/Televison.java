package ch06.sec10.exam02;

public class Televison {

    static String company = "MyCompany";
    static String model = "LCD";
    static String info;

    //정적블럭
    //info는 정적블록에서 company와 model을 서로 연결하여 초기값으로 줌
    static{
        info = company +"-"+model;
    }
}
