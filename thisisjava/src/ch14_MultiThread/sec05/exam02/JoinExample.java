package ch14_MultiThread.sec05.exam02;

public class JoinExample {
  public static void main(String[] args) {
    SumThread sumThread = new SumThread();
    sumThread.start();
    try {
      sumThread.join(); // sumThread가 계산 작업을 모두 마칠 때까지 메인 스레드는 일시 정지 상태
    } catch (InterruptedException e) {
      // TODO: handle exception
    }
    System.out.println("1-100 합: " + sumThread.getSum());
  }
}
