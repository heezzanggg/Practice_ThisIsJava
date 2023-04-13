package ch12.test.exam15;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class SimpleDateFormateExample {
  public static void main(String[] args) {

    LocalDateTime startDateTime = LocalDateTime.now();
    LocalDateTime lastDateTime = LocalDateTime.of(2023, 12, 31, 23, 59, 59);

    // 남은 일
    long remainDay = startDateTime.until(lastDateTime, ChronoUnit.DAYS);
    System.out.println(remainDay);

  }
}
