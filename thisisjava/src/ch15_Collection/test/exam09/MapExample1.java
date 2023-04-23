package ch15_Collection.test.exam09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample1 {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();

    map.put("blue", 96);
    map.put("hong", 86);
    map.put("white", 97);

    String name = null; // 최고점수 받은 아이디 저장하는 변수
    int maxScore = 0; // 최고점수 저장하는 변수
    int totalScore = 0; // 점수 합계 저장하는 변수

    Set<String> keySet = map.keySet();
    Iterator<String> keyIterator = keySet.iterator();
    while (keyIterator.hasNext()) {
      String k = keyIterator.next();
      int v = map.get(k);
      totalScore += v;
      if (v > maxScore) {
        maxScore = v;
        name = k;
      }
    }

    int avgScore = totalScore / map.size();
    System.out.println("평균점수: " + avgScore);

    System.out.println("최고점수: " + maxScore);

    System.out.println("최고점수 받은 아이디: " + name);

  }
}
