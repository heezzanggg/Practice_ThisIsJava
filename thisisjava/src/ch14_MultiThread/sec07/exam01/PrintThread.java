package ch14_MultiThread.sec07.exam01;

public class PrintThread extends Thread {

  private boolean stop; // false

  // 외부에서 stop필드값 변경할 수 있도록 Setter선언
  public void setStop(boolean stop) {
    this.stop = stop;
  }

  @Override
  public void run() {
    int i = 1;
    while (!stop) {
      // System.out.println(!stop); // true
      System.out.println(i + " 실행중");
      i++;
    }
    System.out.println(!stop); // false
    System.out.println("리소스 정리");
    System.out.println("실행 종료");
  }

}
