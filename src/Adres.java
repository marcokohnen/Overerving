public class Adres {
    private String straat, gemeente;
    private int nummer, postcode;

    public Adres() {
    }

    public Adres(String straat, int nummer, int postcode, String gemeente) {
        this.straat = straat;
        this.nummer = nummer;
        this.gemeente = gemeente;
        this.postcode = postcode;
    }

    public String getStraat() {
        return straat;
    }

    public void setStraat(String straat) {
        this.straat = straat;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public String getGemeente() {
        return gemeente;
    }

    public void setGemeente(String gemeente) {
        this.gemeente = gemeente;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return getStraat() + " " + getNummer() + "\n" + getPostcode() + " " + getGemeente();
    }
}
