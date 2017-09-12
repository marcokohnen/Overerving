import java.text.NumberFormat;
import java.util.Locale;

public class Manager extends Werknemer {

    private int bonus;
    private static int aantalManagers;

    public Manager(String naam, String voornaam, Adres adres, int salaris, String functie) {
        super(naam, voornaam, adres, salaris, functie);
        bonus = 50;
        aantalManagers++;
    }

    public Manager(String naam, String voornaam, Adres adres, int salaris, String functie, int bonus) {
        super(naam, voornaam, adres, salaris, functie);
        this.bonus = bonus;
        aantalManagers++;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int getSalaris() {
        return super.getSalaris() + bonus;
    }

    public int getAantalManagers() {
        return aantalManagers;
    }

    public double getProcAandeelManagers() {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.ENGLISH);
        numberFormat.setMaximumFractionDigits(2);
        return (aantalManagers / getAantalWerkenemers()) * 100;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
