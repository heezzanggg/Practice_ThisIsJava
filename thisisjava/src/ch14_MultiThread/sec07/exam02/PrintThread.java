package ch14_MultiThread.sec07.exam02;

public class PrintThread extends Thread {

  public void run() {
    try {
      while (true) {
        System.out.println("실행중");
        Thread.sleep(1); // 일시정지 만듦(InterruptedException이 발생할 수 있도록)
      }
    } catch (InterruptedException e) {
      // TODO: handle exception
    }
    System.out.println("리소스정리");
    System.out.println("실행 종료");
  }

}
