package ch15_Collection.sec06_LIFOandFIFO.exam02_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {// Queue -> FIFO
  public static void main(String[] args) {
    // Queue컬렉션 생성생성
    Queue<Message> messageQueue = new LinkedList<Message>();

    // 메시지 넣기
    messageQueue.offer(new Message("sendMail", "홍길동"));
    messageQueue.offer(new Message("snedSNS", "신용권"));
    messageQueue.offer(new Message("sendKakaotalk", "김자바"));

    // 메시지 하나씩 꺼내기
    while (!messageQueue.isEmpty()) {
      Message message = messageQueue.poll();
      switch (message.command) {
        case "sendMail":
          System.out.println(message.to + "님에게 메일을 보냅니다");
          break;
        case "snedSNS":
          System.out.println(message.to + "님에게 SNS를 보냅니다");
          break;
        case "sendKakaotalk":
          System.out.println(message.to + "님에게 카카오톡을 보냅니다");
          break;
      }
    }

  }
}
