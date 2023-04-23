package ch15_Collection.test.exam09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapExample2 {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();

    map.put("hong", 86);
    map.put("white", 97);
    map.put("blue", 96);

    String name = null; // 최고점수 받은 아이디 저장하는 변수
    int maxScore = 0; // 최고점수 저장하는 변수
    int totalScore = 0; // 점수 합계 저장하는 변수

    Set<Entry<String, Integer>> entrySet = map.entrySet();
    Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
    while (iterator.hasNext()) {
      Entry<String, Integer> entry = iterator.next();
      totalScore += entry.getValue();
      if (entry.getValue() > maxScore) {
        name = entry.getKey();
        maxScore = entry.getValue();
      }
    }

    int avgScore = totalScore / map.size();
    System.out.println("평균점수: " + avgScore);
    System.out.println("최고점수: " + maxScore);
    System.out.println("최고점수를 받은 아이디: " + name);

  }
}
