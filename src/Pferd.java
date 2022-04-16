public class Pferd implements Transport {

    public int breite;
    public int hoehe;
    public int laenge;
    public int gewicht;
    public String name;
    public String tierart;

    public Pferd (int breite, int hoehe, int laenge, int gewicht, String name, String tierart){
        this.breite = breite;
        this.gewicht = gewicht;
        this.laenge = laenge;
        this.name = name;
        this.tierart = tierart;
    }
    @Override
    public String beschrifteNamen() {
        return "Umzug von Lebewesen: " + name + "(" + tierart + ")";
    }
    @Override
    public int getBreite() {
        return breite;
    }
    @Override
    public int getHoehe() {
        return hoehe;
    }
    @Override
    public int getLaenge() {
        return laenge;
    }
    @Override
    public int getGewicht() {
        return gewicht;
    }

}

