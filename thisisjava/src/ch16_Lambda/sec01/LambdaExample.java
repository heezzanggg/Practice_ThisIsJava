package ch16_Lambda.sec01;

public class LambdaExample {
  public static void main(String[] args) {
    action((x,y)->{
      int result = x + y;
      System.out.println("reult :" +result);
    });

    action((x,y)->{
      int result = x-y;
      System.out.println("result: " + result);
    });
  }

  public static void action(Calcuable calcuable){
    //데이터
    int x = 10;
    int y = 4;
    //데이터 처리 
    calcuable.Calculate(x, y);
  }
}
