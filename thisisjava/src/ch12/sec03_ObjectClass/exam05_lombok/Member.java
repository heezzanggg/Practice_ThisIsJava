package ch12.sec03_ObjectClass.exam05_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // @RequiredArgsConstructor, @Getter, @Setter, @ToString, @EqualsAndHashCode
      // 합쳐진것
@NoArgsConstructor
@AllArgsConstructor
public class Member {
  private String id;
  private String name;
  private int age;

}

// lombok vscode 추가 법
// 1.lombok.jar 다운로드
// 2.JAVA PROJECTS 의 Referenced Libraries 에 lombok.jar추가 후 refresh

// @Data : @RequiredArgsConstructor, @Getter, @Setter, @ToString,
// @EqualsAndHashCode 합쳐진것
// @NoArgsConstructor : 기본(매개변수가 없는) 생성자 포함
// AllArgsConstructor : 모든 필드를 초기화시키는 생성자 포함
// @RequiredArgsConstructor : 기본적으로 매개변수가 없는 생성자를 포함
// if, final or @NonNull이 붙은 필드가 있다면 이 필드만 초기화시키는 생성자 포함
// 초기화된 final필드는 변경 불가(Setter가 만들어지지 않음 ), @NonNull은 null이 아닌 다른값으로 Setter를 통해서
// 변경 가능
// @Getter : Getter 메소드 포함
// @Setter : Setter 메소드 포함
// @ToString : toString 메소드 포함
// @EqualsAndHashCode : equals()와 hashCode()메소드 포함