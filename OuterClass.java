/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor6;
/*
Nama      : Resky Ayu Dewi Talasari_13020180128
Kelas     : B2
hari/tgl  : Minggu, 10 Mei 2020
 */
/**
 *
 * @author windows
 */
public class OuterClass {
   public void display(){
      int num = 23;
      class Inner{
         public void print() {
            System.out.println("This is method inner class "+num);
         }
      }
      Inner obj = new Inner();
      obj.print();
   }
   public static void main(String args[]){
      OuterClass outer = new OuterClass();
      outer.display();
   }
}
