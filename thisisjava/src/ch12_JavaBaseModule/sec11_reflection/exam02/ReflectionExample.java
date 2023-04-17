package ch12_JavaBaseModule.sec11_reflection.exam02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
  // 멤버정보 얻기
  public static void main(String[] args) {
    Class clazz = Car.class;

    System.out.println("[생성자 정보]");
    Constructor[] Constructors = clazz.getDeclaredConstructors();
    for (Constructor Constructor : Constructors) {
      System.out.print(Constructor.getName() + "(");
      Class[] parameters = Constructor.getParameterTypes();
      printParameters(parameters);
      System.out.println(")");
    }
    System.out.println();

    System.out.println("[필드정보]");
    Field[] fields = clazz.getDeclaredFields();
    for (Field field : fields) {
      System.out.println(field.getType().getName() + " " + field.getName());
    }
    System.out.println();

    System.out.println("[메소드 정보]");
    Method[] methods = clazz.getDeclaredMethods();
    for (Method method : methods) {
      System.out.print(method.getName() + "(");
      Class[] parameters = method.getParameterTypes();
      printParameters(parameters);
      System.out.println(")");
    }
  }

  // 생성자 및 메소드의 매개변수 정보 출력
  private static void printParameters(Class[] parameters) {
    for (int i = 0; i < parameters.length; i++) {
      System.out.print(parameters[i].getName());
      if (i < (parameters.length - 1)) {
        System.out.print(",");
      }
    }
  }
}
