package ch07.sec10.exam01;
//추상클래스(abstract)
public class SmartPhone extends Phone{
    //생성자선언
    SmartPhone(String owner){
        //Phone 생성자 호출
        super(owner);
    }

   /*생성자 선언 이거 아닌가??? 위에것두 가능??
   위에 생성자 접근 제한자(private,default,public) 없으니까 default인가??????
    public SmartPhone(String owner){
        super(owner);
    }*/

    //메소드 선언
    void internetSearch(){
        System.out.println("인터넷을 검색");
    }

}
