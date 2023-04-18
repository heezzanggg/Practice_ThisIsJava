package ch14_MultiThread.sec04;

public class ThreadNameExample {
  public static void main(String[] args) {

    // 이 코드를 실행하는 스레드 객체 참조 얻기
    Thread mainThread = Thread.currentThread();
    System.out.println(mainThread.getName());

    for (int i = 0; i < 3; i++) {
      Thread threadA = new Thread() {
        @Override
        public void run() {
          System.out.println(getName() + "실행");
        }
      };
      threadA.start();
    }

    Thread chatThread = new Thread() {
      @Override
      public void run() {
        System.out.println(getName() + "실행");
      }
    };
    chatThread.setName("chat-Thread");
    chatThread.start();
  }
}
