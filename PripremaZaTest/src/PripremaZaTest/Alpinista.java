package PripremaZaTest;
// Kreirati klasu Alpinista koji dodatno pamti koliko poena je alpinista ostvario (celobrojna vrednost) i poeni
// se mogu menjati kroz adekvatnu metodu. Alpinista može da savlada sve uspone do 4000 metara, placa clanarinu u
// iznosu od 1500 pritom za svaki poen ima popust od 50, a informacije o alpinisti se ispisuju u formatu:
//   Alpinista, id: id
//   ime: ime i prezime
//   Broj poena: poeni
public class Alpinista extends Planinar {
    private int ostvareniPoeni;

    public Alpinista(){

    }
    public Alpinista(int id, String ime, String prezime, int ostvareniPoeni){
        super(id, ime, prezime);
        this.ostvareniPoeni = ostvareniPoeni;
    }

    public int getOstvareniPoeni() {
        return ostvareniPoeni;
    }
    public void setOstvareniPoeni(int ostvareniPoeni) {
        this.ostvareniPoeni = ostvareniPoeni;
    }

    @Override
    public String toString() {
        return "Alpinista,id: "+getId() + "; Ime: "+ getIme()+ " "+ getPrezime()+ "; Broj poena: "+ostvareniPoeni;
    }

    @Override
    public int clanarina() {
        int clanarina = 1500;
        clanarina = clanarina - (ostvareniPoeni * 50);
        System.out.println("Clanarina sa popustom je "+ clanarina + " dinara.");
        return clanarina;
    }

    @Override
    public void uspijesanUspon(Planina planina) {
        if (planina.getVisinaPlanine() < 4000 && planina.getVisinaPlanine() > 0){
            System.out.println("Uspjesan uspon");
        }else {
            System.out.println("Vjezbaj jos bato!");
        }
    }


}
