import java.util.ArrayList;

class Tukang_Sayur {
    ArrayList<String> veggies = new ArrayList<>();

    public Tukang_Sayur() {

    }
    public void setSayur(ArrayList<String> veggies) {
        this.veggies = veggies;
    }
    public ArrayList<String> getSayur() {
        return this.veggies;
    }
}

class Sayur extends Tukang_Sayur {
    
    public void tambahSayur(String veggies) {
        super.getSayur().add(veggies);
    }
    public String SayurBusuk(int index){
        return super.getSayur().remove(index);
    }
    public void pertukaranSayur(int index, String veggies) {
        super.getSayur().set(index, veggies);
    }
    public ArrayList<String> koleksiSayur() {
        return super.getSayur();
    }
}

public class Pewarisan_ArrList {
    public static void main(String[] args) {
        Sayur sayur = new Sayur();
        System.out.println(sayur.koleksiSayur());

        sayur.tambahSayur("Kangkung");
        sayur.tambahSayur("Bayam");
        sayur.tambahSayur("Kenci");
        sayur.tambahSayur("Wortel");
        System.out.println(sayur.koleksiSayur());

        sayur.pertukaranSayur(1, "Kol");
        System.out.println(sayur.koleksiSayur());

        sayur.SayurBusuk(1);
        System.out.println(sayur.koleksiSayur());
    }
}