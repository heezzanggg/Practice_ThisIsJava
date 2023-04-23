package ch15_Collection.sec07_SynchronizedCollection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapExample {
  public static void main(String[] args) {
    // Map컬렉션 생성
    Map<Integer, String> map = Collections.synchronizedMap(new HashMap<Integer, String>());
    // Map<Integer, String> map = new HashMap<>();
    // 작업스레드 객체생성
    Thread threadA = new Thread() {
      @Override
      public void run() {
        // 객체 1000개 추가
        for (int i = 1; i <= 1000; i++) {
          map.put(i, "내용" + i);
        }
      }
    };

    // 작업스레드 객체생성
    Thread threadB = new Thread() {
      @Override
      public void run() {
        // 객체 1000개 추가
        for (int i = 1001; i <= 2000; i++) {
          map.put(i, "내용" + i);
        }
      }
    };

    // 작업스레드 실행
    threadA.start();
    threadB.start();

    // 작업스레드들이 모두 종료될 때까지 메인 스레드를 기다리게함
    try {
      threadA.join();
      threadB.join();
    } catch (Exception e) {
      // TODO: handle exception
    }

    // 저장된 객체 수 얻기
    System.out.println("총 객체수: " + map.size());
  }
}
