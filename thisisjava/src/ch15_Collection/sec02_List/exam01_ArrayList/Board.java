package ch15_Collection.sec02_List.exam01_ArrayList;

public class Board {

  // 필드(데이터)
  private String subject;
  private String content;
  private String writer;

  // 생성자
  public Board(String subject, String content, String writer) {
    this.subject = subject;
    this.content = content;
    this.writer = writer;
  }

  // getter,setter
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getWriter() {
    return writer;
  }

  public void setWriter(String writer) {
    this.writer = writer;
  }
}
