package ch05.sec09_ArrayCopy;

//배열복사 : 배열은 한번 생성하면 길이 변경 불가
//배열을 새로 만들고 이전 배열로부터 항목들을 복사해야함. 
//1.for문 이용해서 기존 배열의 항목들 읽어서 새로운 배열에 넣어야함
//2.System의 arraycopy() 메소드 이용
//System.arraycopy(원본배열,원본배열 복사 시작 인덱스,새 배열,새 배열 붙여넣기 시작 인덱스,복사 항목 수);

public class ArrayCopyExample {
  public static void main(String[] args) {
    // 길이가 3인 배열
    String[] oldStrArray = { "java", "array", "copy" };
    // 길이가 5인 배열 새로 생성
    String[] newStrArray = new String[5];
    // 배열항목 복사
    System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

    for (int i = 0; i < newStrArray.length; i++) {
      System.out.print(newStrArray[i] + ",");
    }

  }
}
