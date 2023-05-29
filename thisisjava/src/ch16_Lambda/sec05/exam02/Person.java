package ch16_Lambda.sec05.exam02;

public class Person {
  public void ordering(Comparable comparable){
    String a = "홍길동";
    String b = "김길동";

    int result = comparable.compare(a, b);

    if(result < 0){
      System.out.println(a+" 은"+b+" 보다 앞");
    }else if (result == 0){
      System.out.println(a+" 은"+b+" 와 같음");
    }else{
      System.out.println(a+" 은"+b+" 보다 뒤");
    }
  }
}
