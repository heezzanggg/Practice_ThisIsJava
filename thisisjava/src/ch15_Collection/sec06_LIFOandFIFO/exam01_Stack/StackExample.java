package ch15_Collection.sec06_LIFOandFIFO.exam01_Stack;

import java.util.Stack;

public class StackExample { // stack -> FILO
  public static void main(String[] args) {
    // Stack 컬렉션 생성
    Stack<Coin> coinBox = new Stack<Coin>();

    // 동전넣기
    coinBox.push(new Coin(100));
    coinBox.push(new Coin(50));
    coinBox.push(new Coin(500));
    coinBox.push(new Coin(10));

    // 동전 하나씩 꺼내기
    while (!coinBox.isEmpty()) {// 비어있지않다면 반복
      Coin coin = coinBox.pop();
      System.out.println("꺼내온 동전" + coin.getValue() + "원");
    }
  }
}
