package ch14_MultiThread.sec06.exam02;

public class WaitNotifyExample {
  public static void main(String[] args) {
    WorkObject workObject = new WorkObject();// 공유작업객체 생성

    // 작업스레드 생성
    ThreadA threadA = new ThreadA(workObject);
    ThreadB threadB = new ThreadB(workObject);

    // 작업스레드 실행
    threadA.start();
    threadB.start();
  }
}
