package ch05_ReferenceType.sec03;

public class ReferenceVariableCompareExample {
  public static void main(String[] args) {
    // 배열 선언
    int[] arr1;
    int[] arr2;
    int[] arr3;

    arr1 = new int[] { 1, 2, 3 }; // 배열 {1,2,3}생성 후 arr1변수에 대입
    arr2 = new int[] { 1, 2, 3 }; // 배열 {1,2,3}생성 후 arr2변수에 대입
    arr3 = arr2; // 배열 변수 arr2의 값을 배열 변수 arr3에 대입

    System.out.println(arr1 == arr2); // false //arr1, arr2의 저장 항목은 같지만 서로 다른 배열 객체로 생성 되기때문에 대입 번지가 다름
    System.out.println(arr2 == arr3); // true //arr3에 arr2변수의 번지각 대입되었으므로 두 변수는 동일한 번지 가졌고 같은 배열을 참조

  }

}
