package ch05_ReferenceType.sec12;

//열거타입 : 한정된 값을 갖는 타입
//열거타입도 하나의 데이터 타입이므로 변수 선언하고 사용해야함
//열거 타입 변수에 열거 상수 대입 : '열거타입.열거상수' 형태로 작성해야함 Week today = Week.SUNDAY;
public enum Week {
  // 열거상수목록(한정된 값 목록)
  MONDAY,
  TUESDAY,
  WENDSDAY,
  THURSDAY,
  FRIDAY,
  SATURDAY,
  SUNDAY

}

// 열거상수 : 열거타입으로 사용할 수 있는 한정된 값