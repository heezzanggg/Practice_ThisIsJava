package ch14_MultiThread.sec07.exam03;

public class InterruptExample {
  public static void main(String[] args) {
    Thread thread = new PrintThread();
    thread.start();

    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {
      // TODO: handle exception
    }
    thread.interrupt(); // interrupt() 메소드 호출
  }
}
