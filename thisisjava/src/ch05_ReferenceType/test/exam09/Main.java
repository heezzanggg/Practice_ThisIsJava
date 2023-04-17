package ch05_ReferenceType.test.exam09;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // 학샏들의 점수 분석하는 프로그램
    // 학생수, 학생들의 점수 입력받고 while,Scanner의 nextLine()메소드 이용해서
    // 최고점수, 평균점수 출력하는 코드 작성
    Scanner sc = new Scanner(System.in);

    boolean run = true;
    int studentNum = 0;
    int[] scores = null;

    while (run) {
      System.out.println("------------------------------------------------------");
      System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
      System.out.println("------------------------------------------------------");
      System.out.print("선택> ");
      int selectNo = sc.nextInt(); // 선택 번호

      if (selectNo == 1) { // 학생 수
        System.out.print("학생수> ");
        studentNum = sc.nextInt();
        scores = new int[studentNum];
      } else if (selectNo == 2) { // 점수 입력
        for (int i = 0; i < studentNum; i++) {
          System.out.print("scores[" + i + "]> ");
          scores[i] = sc.nextInt();
        }
      } else if (selectNo == 3) { // 점수리스트 출력
        for (int i = 0; i < scores.length; i++) {
          System.out.println("scores[" + i + "]: " + scores[i]);
        }
      } else if (selectNo == 4) { // 점수분석 : 최고점수 & 평균 점수
        int max = 0;
        int sum = 0;
        double avg = 0.0;
        for (int i = 0; i < scores.length; i++) {
          // 최고점수
          if (scores[i] > max) {
            max = scores[i];
          }
          // 평균점수
          sum += scores[i];
          avg = (double) sum / scores.length;
        }
        System.out.println("최고 점수: " + max);
        System.out.println("평균 점수: " + avg);
      } else {
        System.out.println("프로그램 종료");
        run = false;
      }
    }

  }
}
