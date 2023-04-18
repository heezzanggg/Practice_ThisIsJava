package ch14_MultiThread.sec07.exam01;

public class SafeStopExample {
  public static void main(String[] args) {
    PrintThread printThread = new PrintThread();
    printThread.start();

    try {
      Thread.sleep(10);
    } catch (InterruptedException e) {
      // TODO: handle exception
    }

    printThread.setStop(true); // PrintThread를 종료하기위해 stop필드값 변경
  }

}
