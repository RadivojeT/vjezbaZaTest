package PripremaZaTest;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Planina orlovic = new Planina("Orlovic", "BIH",1800);

        RekreativniPlaninar rekreativac1 = new RekreativniPlaninar(123,"Mile","Malic",
                10,"Trnova",2100);
        RekreativniPlaninar rekreativac2 = new RekreativniPlaninar(124,"Mile","Babic",
                10,"Trnova",1800);
        RekreativniPlaninar rekreativac3 = new RekreativniPlaninar(125,"Rajko","Malic",
                10,"Trnova",1900);

        Alpinista alpinista1 = new Alpinista(222,"Rade","Tomic",13);
        Alpinista alpinista2 = new Alpinista(223,"Radovan","Bojic",8);
        Alpinista alpinista3 = new Alpinista(224,"Mlade","Tesic",3);

        ArrayList<Planinar> planinari = new ArrayList<>();
        planinari.add(rekreativac1);
        planinari.add(rekreativac2);
        planinari.add(rekreativac3);
        planinari.add(alpinista1);
        planinari.add(alpinista2);
        planinari.add(alpinista3);

        for (Planinar p: planinari){
            System.out.println(p);
        }

        for (Planinar p: planinari){
            p.uspijesanUspon(orlovic);
        }

        int suma =0;
        for (Planinar p: planinari){
            if (p instanceof Alpinista && p instanceof RekreativniPlaninar){
                suma += p.clanarina();
            }
        }
        System.out.println("Ukupna clanarina je: "+suma);


    }
}
