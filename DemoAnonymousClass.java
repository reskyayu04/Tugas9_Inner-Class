package anonymous_class;

/*
Nama      : Resky Ayu Dewi Talasari_13020180128
Kelas     : B2
hari/tgl  : Minggu, 10 Mei 2020
 */
public class DemoAnonymousClass {
  public static void main(String[] args){
    Thread anonymous = new Thread(){
      @Override
      public void run(){
        System.out.println("This is example anonymous class in Java");
      }
    };
    anonymous.start();
  }
}
