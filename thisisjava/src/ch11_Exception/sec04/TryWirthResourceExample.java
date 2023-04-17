package ch11_Exception.sec04;

public class TryWirthResourceExample {
  public static void main(String[] args) {

    try (Myresource res = new Myresource("A")) {
      String data = res.read1();
      int value = Integer.parseInt(data);
    } catch (Exception e) {
      System.out.println("예외처리:" + e.getMessage());
    }

    System.out.println();

    try (Myresource res = new Myresource("A")) {
      String data = res.read2();
      // NumberFormatEception 발생
      int value = Integer.parseInt(data);
    } catch (Exception e) {
      System.out.println("예외처리:" + e.getMessage());
    }

    System.out.println();

    Myresource res1 = new Myresource("A");
    Myresource res2 = new Myresource("B");

    try (res1; res2) {
      String data1 = res1.read1();
      String data2 = res2.read1();
    } catch (Exception e) {
      System.out.println("예외처리:" + e.getMessage());
    }
  }

}
