public class Persoon {

    private String naam, voornaam;
    private Adres adres;

    public Persoon(String naam, String voornaam, String straat, int nummer, int postcode, String gemeente) {
        this(naam, voornaam, new Adres(straat, nummer, postcode, gemeente));
    }

    public Persoon(String naam, String voornaam, Adres adres) {
        this.naam = naam;
        this.voornaam = voornaam;
        this.adres = adres;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public void voegVoornamenToe(String...voornamen) {
        for (String nieuweVoornaam: voornamen) {
            voornaam = voornaam + " " + nieuweVoornaam;
        }
    }

    @Override
    public String toString() {
        return getVoornaam() + " " + getNaam() + "\n" + getAdres();
    }
}

