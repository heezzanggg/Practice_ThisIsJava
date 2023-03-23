package ch11.test.exam07;

public class NotExistIDException extends Exception {

  // 기본생성자
  public NotExistIDException() {
  }

  // 에러메시지있는 생성자
  public NotExistIDException(String message) {
    super(message);
  }

}
