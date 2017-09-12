public class Werknemer extends Persoon {
    String functie = "algemeen bediende";
    int Salaris = 1800;
    private static final int minSalaris = 1000;
    private static int aantalWerknemers;

    public Werknemer(String naam, String voornaam, Adres adres) {
        super(naam, voornaam, adres);
    }

    public Werknemer(String naam, String voornaam, Adres adres, int salaris, String functie) {
        super(naam, voornaam, adres);
        this.functie = functie;
        this.Salaris = salaris;
        aantalWerknemers++;
    }

    public String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    public int getSalaris() {
        return Salaris;
    }

    public void setSalaris(int salaris) {
        if (salaris < minSalaris) {
            System.out.println("Minimumsalaris = 1000 !");
        }
        else {
            Salaris = salaris;
        }
    }

    public static int getMinSalaris() {
        return minSalaris;
    }

    public int getAantalWerkenemers() {
        return aantalWerknemers;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + this.getFunctie() + " " + this.getSalaris();
    }
}
