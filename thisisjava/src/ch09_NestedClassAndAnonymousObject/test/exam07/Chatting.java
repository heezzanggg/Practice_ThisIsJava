package ch09_NestedClassAndAnonymousObject.test.exam07;

public class Chatting {

  // 중첩클래스 - 인스턴스 멤버 클래스
  class Chat {
    void start() {
    }

    void sendMessage(String message) {
    }
  }

  // void startCaht(String chatId) {

  // String nickName = null;
  // nickName = chatId;

  // Chat chat = new Chat() {
  // @Override
  // public void start() {
  // while (true) {
  // String inputData = "안녕하세요";
  // String message = "[" + nickName + "]" + inputData;
  // sendMessage(message);
  // }
  // }
  // };
  // // nickName은 final특성을 지님 => startChat()메소드에서 nickName = chatId와 같이 값 변경 불가
  // (읽기 가능 but 수정 불가)
  // // =>따라서 String nickName = null;과 nickName=chatId; 제거하고
  // //String nickName = chatId; 넣어야함

  // chat.start();
  // }

  void startCaht(String chatId) {

    String nickName = chatId;

    Chat chat = new Chat() {

      @Override
      public void start() {

        while (true) {
          String inputData = "안녕하세요";
          String message = "[" + nickName + "]" + inputData;
          sendMessage(message);
        }
      }
    };

    chat.start();
  }
}
