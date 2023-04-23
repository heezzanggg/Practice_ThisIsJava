package ch15_Collection.sec04_Map.exam01_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapExample {
  public static void main(String[] args) {
    // Map 컬렉션 생성
    Map<String, Integer> map = new HashMap<>();

    // 겍체 저장
    map.put("신용권", 85);
    map.put("홍길동", 90);
    map.put("동장군", 80);
    map.put("홍길동", 95);// 키가 같기 때무에 제일 마지막에 저장한 값만 저장
    System.out.println("총 Entry 수: " + map.size());
    System.out.println();

    // 키로 값 얻기
    String key = "홍길동";
    int value = map.get(key);// 키를 매개값으로 주면 값을 리턴
    System.out.println(key + " : " + map.get("홍길동"));
    System.out.println(key + " : " + map.get(key));
    System.out.println(key + " : " + value);
    System.out.println();

    // 키Set컬렉션을 얻고, 반복해서 키와 값 얻기
    Set<String> keySet = map.keySet();
    System.out.println("keySet:" + keySet);

    // 객체를 하나씩 가져와서 처리
    Iterator<String> keyIterator = keySet.iterator();
    while (keyIterator.hasNext()) { // hasNext() : 가져올 객체가 있으면 true, 없으면 false
      String k = keyIterator.next(); //// next(): 컬렉션에서 하나의 객체를 가져온다
      Integer v = map.get(key);
      System.out.println(k + " : " + v);
    }
    System.out.println();

    // 엔트리Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
    Set<Entry<String, Integer>> entrySet = map.entrySet();
    System.out.println("entrySet: " + entrySet);
    Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
    while (entryIterator.hasNext()) {
      Entry<String, Integer> entry = entryIterator.next();
      String k = entry.getKey();
      Integer v = entry.getValue();
      System.out.println(k + " : " + v);
    }
    System.out.println();

    // 키로 엔트리 삭제
    map.remove("홍길동");
    System.out.println("총 Entry tn: " + map.size());
    System.out.println();
  }
}
