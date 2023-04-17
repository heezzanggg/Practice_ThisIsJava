package ch05_ReferenceType.sec07_MultidiemnsionalArray;

public class MultidimensionalArrayByValueListExample {
  public static void main(String[] args) {
    // 2차원 배열 선언
    int[][] scores = {
        { 80, 90, 96 },
        { 76, 88 }
    };

    // 배열의 길이
    System.out.println("1차원 배열 길이:" + scores.length); // 2
    System.out.println("2차원 배열 길이(첫번째 반): " + scores[0].length); // 3
    System.out.println("2차원 배열 길이(두번째 반): " + scores[1].length); // 2

    // 첫번째반의 세번째 학생 점수 읽기
    System.out.println("첫번째반의 세번째 학생 점수(scores[0][2]): " + scores[0][2]);

    // 두번째반의 두번째 학생 점수 읽기
    System.out.println("두번째반의 두번째 학생 점수(scores[1][1]): " + scores[1][1]);

    // 첫번째반의 평균 점수 구하기
    int class1Sum = 0;
    for (int i = 0; i < scores[0].length; i++) {
      class1Sum += scores[0][i];
    }
    double class1Avg = (double) class1Sum / scores[0].length;
    System.out.println("첫번째반의 평균 점수: " + class1Avg);

    // 두번째반의 평균 점수 구하기
    int class2Sum = 0;
    for (int i = 0; i < scores[1].length; i++) {
      class2Sum += scores[1][i];
    }
    double class2Avg = (double) class2Sum / scores[1].length;
    System.out.println("두번째반의 평균 점수: " + class2Avg);

    // 전체 학생의 평균 점수 구하기
    int totalStudent = 0;
    int totalSum = 0;
    for (int i = 0; i < scores.length; i++) { // 반의 수만큼 반복
      totalStudent += scores[i].length; // 반의 학생 수 합산
      for (int j = 0; j < scores[i].length; j++) { // 해당 반의 학생 수 만큼 반복
        totalSum += scores[i][j]; // 학생 점수 합산
      }
    }
    double totalAvg = (double) totalSum / totalStudent;
    System.out.println(totalStudent);
    System.out.println("전체학생의 평균 점수 : " + totalAvg);
  }

}
