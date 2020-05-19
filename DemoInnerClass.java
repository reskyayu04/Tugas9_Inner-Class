package no5;
/*
Nama      : Resky Ayu Dewi Talasari_13020180128
Kelas     : B2
hari/tgl  : Minggu, 10 Mei 2020
 */
public class DemoInnerClass {
  private class Inner {
    public void printText(){
      System.out.println("Inner class example in Java");
    }
  }
  public static void main(String[] args){
    DemoInnerClass oDemo = new DemoInnerClass();
    DemoInnerClass.Inner oInner = oDemo.new Inner();
    oInner.printText();
  }
}
