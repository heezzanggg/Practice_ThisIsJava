package ch11_Exception.test.exam07;

public class WrongPasswordException extends Exception {

  // 기본생성자
  public WrongPasswordException() {
  }

  // 에러메시지 있는 생성자
  public WrongPasswordException(String message) {
    super(message);
  }

}
