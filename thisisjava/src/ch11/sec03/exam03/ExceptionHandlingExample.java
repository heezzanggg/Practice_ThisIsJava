package ch11.sec03.exam03;

public class ExceptionHandlingExample {
  public static void main(String[] args) {
    String[] array = { "100", "1oo", null, "200" };

    for (int i = 0; i <= array.length; i++) {
      try {
        int value = Integer.parseInt(array[i]);
        System.out.println("array[" + i + "]" + value);
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("배열 인덱스 초과됨" + e.getMessage());
      } catch (NullPointerException | NumberFormatException e) { // 두개이상의 예외를 하나의 catch문으로 동일하게 예외 처리 하고 싶을 경우, catch블록에
                                                                 // 예외 클래스를 기호 | 로 연결
        System.out.println("데이터에 문제 있음" + e.getMessage());
      }
    }
  }
}
