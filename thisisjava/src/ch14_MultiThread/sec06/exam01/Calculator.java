package ch14_MultiThread.sec06.exam01;

public class Calculator {
  private int memory;

  public int getMemory() {
    return memory;
  }

  // 동기화 메소드
  public synchronized void setMemory1(int memory) {
    this.memory = memory; // 메모리값 저장
    try {
      Thread.sleep(2000); // 2초 일시 정지
    } catch (InterruptedException e) {
    }
    System.out.println(Thread.currentThread().getName() + ":" + this.memory);
  }

  public void setMemory2(int memory) {
    synchronized (this) {
      this.memory = memory; // 메모리값 저장
      try {
        Thread.sleep(2000); // 2초 일시정지
      } catch (InterruptedException e) {
      }
    }
    System.out.println(Thread.currentThread().getName() + ":" + this.memory);
  }
}
