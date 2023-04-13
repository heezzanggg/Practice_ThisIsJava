package ch12.sec12_annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationExample {
  public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {

    Method[] declaredMethods = Service.class.getDeclaredMethods();
    // System.out.println(declaredMethods[0]);
    for (Method method : declaredMethods) {

      // PrintAnnotaion 얻기
      PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

      // 설정정보를 이용해서 선 출력
      printLine(printAnnotation);

      // 메소드 호출
      method.invoke(new Service());

      // 설정정보를 이용해서 선 출력
      printLine(printAnnotation);

    }
  }

  private static void printLine(PrintAnnotation printAnnotation) {
    if (printAnnotation != null) {
      int number = printAnnotation.number();
      for (int i = 0; i < number; i++) {
        // value속성 값 얻기
        String value = printAnnotation.value();
        System.out.print(value);
      }
      System.out.println();
    }
  }
}
