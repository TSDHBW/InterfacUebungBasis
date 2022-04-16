public class Schrank implements Transport{

    public int breite;
    public int hoehe;
    public int laenge;
    public int gewicht;
    public String name;
    public int iD;

    public Schrank (int breite, int hoehe, int laenge, int gewicht, String name, int iD){
        this.breite = breite;
        this.gewicht = gewicht;
        this.laenge = laenge;
        this.name = name;
        this.iD = iD;
    }

    @Override
    public String beschrifteNamen() {
        return "Umzug von Gegenstand: " + name + "(" + iD + ")";
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
