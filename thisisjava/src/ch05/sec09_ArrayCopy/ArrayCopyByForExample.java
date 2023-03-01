package ch05.sec09_ArrayCopy;

//배열복사 : 배열은 한번 생성하면 길이 변경 불가
//배열을 새로 만들고 이전 배열로부터 항목들을 복사해야함. 
//1.for문 이용해서 기존 배열의 항목들 읽어서 새로운 배열에 넣어야함
//2.System의 arraycopy() 메소드 이용
public class ArrayCopyByForExample {
  public static void main(String[] args) {
    // 길이가 3인 배열
    int[] oldIntArray = { 1, 2, 3 };
    // 길이가 5인 배열을 새로 생성
    int[] newIntArray = new int[5];
    // for문을 이용한 배열 항목 복사
    for (int i = 0; i < oldIntArray.length; i++) {
      newIntArray[i] = oldIntArray[i];
    }
    // 배열 항목 출력
    for (int i = 0; i < newIntArray.length; i++) {
      System.out.print(newIntArray[i] + ","); // 1,2,3,0,0, =>복사되지않은 인덱스3,4는 int의 초기값인 0이 출력됨
    }

  }
}
