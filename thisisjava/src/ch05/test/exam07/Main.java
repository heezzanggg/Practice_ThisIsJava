package ch05.test.exam07;

public class Main {
  public static void main(String[] args) {
    // 배열에서 최대값 뽑아내기 (for문 이용)
    // 배열항목을 for로 읽기 -> if 이용해서 max와 읽은 값 크기 비교->배열항목의 값이 max보다 크면 max변수에 대입하기.

    int[] array = { 1, 5, 3, 8, 2 };
    int max = 0;

    for (int i = 0; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }
    System.out.println(max);

  }
}
