package ch05.test.exam09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//다시풀어보기!
public class Test {
  public static void main(String[] args) throws NumberFormatException, IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int studentNum = 0;
    int[] scores = null;

    while (true) {
      System.out.println("======================================================");
      System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
      System.out.println("======================================================");
      System.out.print("선택> ");
      int selectNo = Integer.parseInt(br.readLine());
      if (selectNo == 1) { // 학생 수 입려 받기
        System.out.print("학생수> ");
        studentNum = Integer.parseInt(br.readLine());
        scores = new int[studentNum];
      } else if (selectNo == 2) {// 학생들의 점수
        for (int i = 0; i < scores.length; i++) {
          System.out.print("scores[" + i + "]> ");
          scores[i] = Integer.parseInt(br.readLine());
        }
      } else if (selectNo == 3) { // 점수리스트 출력
        for (int i = 0; i < scores.length; i++) {
          System.out.println("scores[" + i + "]>" + scores[i]);
        }
      } else if (selectNo == 4) {// 최고점수 평균점수 출력
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
          sum += scores[i];

        }
        int max = Arrays.stream(scores).max().getAsInt();
        double avg = (double) sum / scores.length;
        System.out.println("최고 점수: " + max);
        System.out.println("평균 점수: " + avg);

      } else {
        System.out.println("프로그램 종료");
        break;
      }
    }

  }
}
