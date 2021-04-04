import java.util.Queue;
import java.util.LinkedList;

class Toko_Sayur {
      Queue<String> veggies = new LinkedList<String>();
 
      public Toko_Sayur(){
 
      }
      public void setSayur(Queue<String> veggies) {
            this.veggies = veggies;
      }
      public Queue<String> getSayur(){
            return this.veggies;
      }
}

class Sayur extends Toko_Sayur {
      public void tambahSayur(String veggies){
            super.getSayur().add(veggies);
      }
      public void sayurBusuk(int index){
            System.out.println(super.getSayur().poll());
      }
      public Queue<String> sisaSayur(){
            return super.getSayur();
      }
} 


public class Pewarisan_Queue {
      public static void main(String args[]){
            Sayur sayur = new Sayur();
            System.out.println(sayur.sisaSayur());
 
            sayur.tambahSayur("Wortel");
            sayur.tambahSayur("Kangkung");
            sayur.tambahSayur("Kentang");
            sayur.tambahSayur("Seledri");
            sayur.tambahSayur("Letuce");
            System.out.println(sayur.sisaSayur());
 
            sayur.sayurBusuk(2);
            System.out.println(sayur.sisaSayur());
      }      
}