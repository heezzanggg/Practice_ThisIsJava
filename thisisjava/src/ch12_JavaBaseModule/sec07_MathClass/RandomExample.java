package ch12_JavaBaseModule.sec07_MathClass;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
  public static void main(String[] args) {
    // 선택번호
    int[] selectNumber = new int[6]; // 선택번호 6개가 저장될 배열 생성
    Random random = new Random(1); // 선택변호를 얻기 위한 Random 객체 생성
    System.out.println("선택번호: ");
    // 선택번호 6개를 얻어 배열에 저장
    for (int i = 0; i < 6; i++) {
      selectNumber[i] = random.nextInt(45) + 1; // nextInt(45) : 0~44 난수 리턴
      System.out.print(selectNumber[i] + " ");
    }
    System.out.println();

    // 당첨번호
    int[] winningNumber = new int[6];// 당첨번호 6개가 저장될 배열 생성
    random = new Random(1); // 당첨번호를 얻기 위한 Random 객체 생성
    System.out.println("당첨번호: ");
    for (int i = 0; i < 6; i++) {
      winningNumber[i] = random.nextInt(45) + 1;
      System.out.print(winningNumber[i] + " ");
    }
    System.out.println();

    // 당첨여부
    Arrays.sort(selectNumber);
    Arrays.sort(winningNumber);
    boolean result = Arrays.equals(selectNumber, winningNumber);
    System.out.println("당첨여부: ");
    if (result) {
      System.out.println("1등에 당첨되셨습니다.");
    } else {
      System.out.println("당첨되지 않았습니다.");
    }

  }
}
