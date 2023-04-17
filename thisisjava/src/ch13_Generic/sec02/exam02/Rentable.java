package ch13_Generic.sec02.exam02;

public interface Rentable<P> {// 파라미터 타임 P정의
  P rent();// 타입 파라미터 P를 리턴 타입으로 사용

}
