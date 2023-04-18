package ch14_MultiThread.test.exam08;

import ch14_MultiThread.test.exam02.MovieThread;

public class ThreadExample {
  public static void main(String[] args) {
    Thread thread = new MovieThread();
    thread.start();

    // 데몬스레드
    thread.setDaemon(true);
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      // TODO: handle exception
    }
  }
}
