package ch15_Collection.test.exam08;

public class Student {
  public int studentNum;
  public String name;

  public Student(int studentNum, String name) {
    this.studentNum = studentNum;
    this.name = name;
  }

  // 코드작성!!
  @Override
  public int hashCode() {

    return studentNum;

  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Student))
      return false;
    Student student = (Student) obj;
    if (studentNum != student.studentNum)
      return false;
    return true;
  }

}
