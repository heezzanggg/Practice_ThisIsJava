package ch14_MultiThread.sec05.exam01;

import java.awt.Toolkit;

public class SleepExample {
  public static void main(String[] args) {
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    for (int i = 0; i < 10; i++) {
      toolkit.beep();
      try {
        Thread.sleep(300);
      } catch (InterruptedException e) {
      }
    }
  }
}

// 일시정지상태에서는 InterruptedException이 발생할 수 있기 때문에 sleep()은 예외처리가 필요한 메소드