package PripremaZaTest;
// Kreirati klasu RekreativniPlaninar koja pored svega što ima Planinar ima i:
//       težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg),
//       naziv okruga odakle je rekreativni planinar
//       maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
//da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov najveći uspon manji od visine planine,
//s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme koji nosi može da pređe 50 metara manje.
//   - rekeativci placaju clanarinu u iznosu od 1000 rsd
//metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu:
//  Rekreativac, id: id
//  ime: ime prezime
//  Okrug: okrug
public class RekreativniPlaninar extends Planinar{
    private int tezinaOpreme;
    private String okrug;
    private int maxUspon;
    private int clanarina=1000;

    public RekreativniPlaninar(){

    }
    public RekreativniPlaninar(int id, String ime, String prezime, int tezinaOpreme, String okrug, int maxUspon){
        super(id, ime, prezime);
        this.tezinaOpreme = tezinaOpreme;
        this.okrug = okrug;
        this.maxUspon = maxUspon;
    }

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }
    public void setTezinaOpreme(int tezinaOpreme) {
        this.tezinaOpreme = tezinaOpreme;
    }

    public String getOkrug() {
        return okrug;
    }
    public void setOkrug(String okrug) {
        this.okrug = okrug;
    }

    public int getMaxUspon() {
        return maxUspon;
    }
    public void setMaxUspon(int maxUspon) {
        this.maxUspon = maxUspon;
    }

    public int getClanarina() {
        return clanarina;
    }

    @Override
    public String toString() {
        return "Rekreativac,id: "+getId() + "; Ime: "+ getIme()+ " "+ getPrezime() + "; Okrug: "+okrug ;
    }

    @Override
    public int clanarina() {
        //int clanarina = 1000;
        System.out.println("Clanarina je: " + clanarina+ " rsd.");
        return clanarina;
    }

    //maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
    ////da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov najveći uspon manji od visine planine,
    ////s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme koji nosi može da pređe 50 metara manje.
    public void uspijesanUspon(Planina planina){
        if (planina.getVisinaPlanine() < (maxUspon - (tezinaOpreme * 50))){
            System.out.println("Uspijesan uspon");
        }else {
            System.out.println("Vjezbaj jos bato!");
        }


    }
}
