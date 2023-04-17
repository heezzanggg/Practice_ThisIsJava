package ch11_Exception.sec06;

public class InsufficientException extends Exception { // 일반예외로 선언

  // 기본생성자
  public InsufficientException() {
  }

  // 예외메시지를 입력받는 생성자
  public InsufficientException(String message) {
    super(message);
  }

}
