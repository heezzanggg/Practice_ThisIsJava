package ch06_Class.test.exam13;

public class Member {
    // 필드선언
    private String name;
    private String id;
    private String password;
    private int age;

    // 생성자
    public Member() {
    }

    public Member(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // 메소드
    public boolean login(String id, String password) {
        if (id == "hong" && password == "12345") {
            return true;
        } else {
            return false;
        }
    }

    public void logout(String id) {
        System.out.println(id + "님이 로그아웃 되었습니다.");
    }

}
