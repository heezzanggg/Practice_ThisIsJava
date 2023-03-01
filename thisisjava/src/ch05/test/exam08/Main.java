package ch05.test.exam08;

public class Main {
  public static void main(String[] args) {
    // 배열항목의 전체 합과 평균 출력(중첩for이용)
    int[][] array = {
        { 95, 86 },
        { 83, 92, 95 },
        { 78, 93, 83, 87, 88 }
    };
    int sum = 0;
    int size = 0;

    for (int i = 0; i < array.length; i++) {
      size += array[i].length;
      for (int j = 0; j < array[i].length; j++) {
        sum += array[i][j];
      }
    }
    double avg = (double) sum / size;
    System.out.println("총합 = " + sum);
    System.out.println("평균 = " + avg);

  }
}
