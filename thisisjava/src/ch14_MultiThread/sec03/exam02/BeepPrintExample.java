package ch14_MultiThread.sec03.exam02;

import java.awt.Toolkit;

public class BeepPrintExample {
  // 프린팅 -> 메인스레드 & 비프음 -> 작업스레드
  public static void main(String[] args) {

    // 작업스레드 생성
    Thread thread1 = new Thread(new Runnable() {

      @Override
      public void run() {
        // 스레드가 실행 할 코드
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
          toolkit.beep();
          try {
            Thread.sleep(500);
          } catch (Exception e) {
          }
        }
      }
    });

    // 작업 스레드 실행
    thread1.start();

    for (int i = 0; i < 5; i++) {
      System.out.println("띵");
      try {
        Thread.sleep(500);
      } catch (Exception e) {
      }
    }
  }
}
