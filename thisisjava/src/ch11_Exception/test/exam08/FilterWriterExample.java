package ch11_Exception.test.exam08;

public class FilterWriterExample {
  public static void main(String[] args) {

    try (FileWriter fw = new FileWriter("file.txt")) {
      fw.write("java");
    } catch (Exception e) {
    }
  }
}
