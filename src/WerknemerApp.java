public class WerknemerApp {

    public static void main(String[] args) {

        Persoon flip = new Persoon("Fluitketel", "Flip", "kerkstraat", 2, 3630, "Leut");
        System.out.println(flip);
        Persoon kees = new Persoon("Jansen", "Kees", "Langstraat", 12, 3650, "Dilsen");
        System.out.println(kees);
        Persoon jan = new Persoon("Peeters", "Jan", "Hoogstraat", 32, 3600, "Genk");
        System.out.println(jan);

        Persoon joop = new Persoon("Houben", "Joop", new Adres("Hoeveweg", 12, 3600, "Genk"));
        System.out.println(joop);
    }
}
