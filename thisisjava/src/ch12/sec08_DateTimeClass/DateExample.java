package ch12.sec08_DateTimeClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
  public static void main(String[] args) {
    Date now = new Date();
    String strNow1 = now.toString();
    System.out.println(strNow1); // Sat Mar 25 04:32:03 KST 2023

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
    String strNow2 = sdf.format(now);
    System.out.println(strNow2);
  }
}

// Date 클래스 : 날짜정보를 전달하기 위해 사용