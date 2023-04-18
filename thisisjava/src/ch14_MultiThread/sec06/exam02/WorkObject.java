package ch14_MultiThread.sec06.exam02;

public class WorkObject {
  // 동기화 메소드
  public synchronized void methodA() {
    Thread thread = Thread.currentThread();
    System.out.println(thread.getName() + ": methodA 작업실행");
    notify();// 다른 스레드를 실행대기 상태로 만듦
    try {
      wait();// 자신의 스레드는 일시정지 상태로 만듦
    } catch (InterruptedException e) {
      // TODO: handle exception
    }
  }

  // 동기화 메소드
  public synchronized void methodB() {
    Thread thread = Thread.currentThread();
    System.out.println(thread.getName() + ": methodB 작업실행");
    notify(); // 다른 스레드를 실행대기 상태로 만듦
    try {
      wait(); // 자신의 스레드를 일시정지 상태로 만듦
    } catch (InterruptedException e) {
    }
  }
}
