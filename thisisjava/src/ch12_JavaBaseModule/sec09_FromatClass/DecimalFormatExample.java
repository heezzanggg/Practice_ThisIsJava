package ch12_JavaBaseModule.sec09_FromatClass;

import java.text.DecimalFormat;

public class DecimalFormatExample {
  public static void main(String[] args) {
    double num = 1234567.89;

    DecimalFormat df;

    // 정수자리까지 표기
    df = new DecimalFormat("#,###");
    System.out.println(df.format(num)); // 1,234,568

    // 무조건 소수 첫째자리까지 표기
    df = new DecimalFormat("#,###.0");
    System.out.println(df.format(num)); // 1,234,567.9

  }
}
// DecimalFormat : 숫자를 형ㅎ식화된 문자열로 변환하는 기능 제공