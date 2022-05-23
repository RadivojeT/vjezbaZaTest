package PripremaZaTest;
// Kreirati klasu Planina koju opisuju ime planine, naziv države u kojoj se nalazi i visina planine.
//          Klasa mora imati konstruktore i getere i setere.
public class Planina {
    private String imePlanine;
    private String drzava;
    private int visinaPlanine;

    public Planina(){

    }
    public Planina(String imePlanine, String drzava, int visinaPlanine){
        this.imePlanine = imePlanine;
        this.drzava = drzava;
        this.visinaPlanine = visinaPlanine;
    }

    public String getImePlanine() {
        return imePlanine;
    }
    public void setImePlanine(String imePlanine) {
        this.imePlanine = imePlanine;
    }

    public String getDrzava() {
        return drzava;
    }
    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public int getVisinaPlanine() {
        return visinaPlanine;
    }
    public void setVisinaPlanine(int visinaPlanine) {
        if (visinaPlanine > 0) {
            this.visinaPlanine = visinaPlanine;
        }else {
            System.out.println("Ovo zoves planinom");
        }
    }

    @Override
    public String toString() {
        return "Planina: "+ imePlanine + "; Nalazi se u: "+ drzava + "; Visina planine: "+ visinaPlanine;
    }
}
