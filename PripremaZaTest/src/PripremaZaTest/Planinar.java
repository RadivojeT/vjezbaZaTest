package PripremaZaTest;

//  Kreirati klasu Planinar kog opisuju jedinstveni celobrojni identifikacioni broj, ime i prezime.
//  Svi podaci smeju da se dohvate, ali ne i postave mimo konstruktora koji postavlja sve attribute klase.
//  Pored toga, klasa ima:
//         apstraktnu metodu štampaj
//         apstraktnu metodu koja vraca clanarinu planinara
//         apstraktnu metodu uspesanUspon koja vraća informaciju da li će se planinar upešno popeti na planinu.
//         -Metoda kao ulazni parametar prima objekat tipa Planina.
// metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu:
//  Rekreativac, id: id
//  ime: ime prezime
//  Okrug: okrug
public abstract class Planinar {
    private int id;
    private String ime;
    private String prezime;

    public Planinar(){

    }
    public Planinar(int id, String ime, String prezime){
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
    }

    public int getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    @Override
    public abstract String toString();

    public abstract int clanarina();

    public abstract void uspijesanUspon(Planina visinaPlanine);
}
