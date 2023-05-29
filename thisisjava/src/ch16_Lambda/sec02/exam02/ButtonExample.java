package ch16_Lambda.sec02.exam02;

public class ButtonExample {
  public static void main(String[] args) {
    Button btnOk = new Button();

    btnOk.setClickListener(()->{
      System.out.println("ok버튼 클릭함");
    });
    btnOk.click();

    Button btnCancel = new Button();

    btnCancel.setClickListener(()->{
      System.out.println("Cancle버튼 클릭함");
    });
    btnCancel.click();
  }
}
