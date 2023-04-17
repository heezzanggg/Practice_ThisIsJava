package ch05_ReferenceType.sec06_Array;

public class ArrayCreateByVaueListExample {
  public static void main(String[] args) {
    // 배열 변수 선언과 배열 생성
    String[] season = { "Spring", "Summer", "Fall", "Winter" };

    // 배열의 항목값 읽기
    System.out.println("============배열의 항목값 읽기============");

    System.out.println("season[0]: " + season[0]);
    System.out.println("season[1]: " + season[1]);
    System.out.println("season[2]: " + season[2]);
    System.out.println("season[3]: " + season[3]);

    // 인덱스 1번 항목값 변경
    System.out.println("============인덱스 1번 항목값 변경============");
    season[1] = "여름";
    System.out.println("season[1]: " + season[1]);

    // 배열 변수 선언과 배열 생성
    int[] scores = { 83, 90, 87 };

    // 총합과 평균 구하기
    System.out.println("============총합과 평균 구하기============");

    int sum = 0;
    for (int i = 0; i < scores.length; i++) {
      sum += scores[0];
    }
    System.out.println("총합: " + sum);
    double avg = (double) sum / 3;
    System.out.println("평균: " + avg);
  }
}
