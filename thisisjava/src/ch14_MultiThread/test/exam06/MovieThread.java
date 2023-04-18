package ch14_MultiThread.test.exam06;

public class MovieThread extends Thread {
  @Override
  public void run() {
    while (true) {
      System.out.println("동영상 재생");

      if (Thread.interrupted()) {
        break;
      }
    }
    System.out.println("종료");
  }
}
