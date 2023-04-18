package ch14_MultiThread.sec05.exam03;

public class YieldExample {
  public static void main(String[] args) {
    WorkThread WorkThreadA = new WorkThread("workThreadA");
    WorkThread WorkThreadB = new WorkThread("workThreadB");
    WorkThreadA.start();
    WorkThreadB.start();

    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      WorkThreadA.work = false;
    }

    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      WorkThreadA.work = true;
    }

  }
}
