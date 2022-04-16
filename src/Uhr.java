public class Uhr extends Luxusgegenstand implements Transport{

    public int breite;
    public int hoehe;
    public int laenge;
    public int gewicht;
    public String name;
    public int iD;

    public Uhr (int breite, int hoehe, int laenge, int gewicht, String name, int iD){
        this.breite = breite;
        this.gewicht = gewicht;
        this.laenge = laenge;
        this.name = name;
        this.iD = iD;
    }

    @Override
    public int getBreite() {
        return 0;
    }

    @Override
    public int getHoehe() {
        return 0;
    }

    @Override
    public int getLaenge() {
        return 0;
    }

    @Override
    public int getGewicht() {
        return 0;
    }

    @Override
    public String beschrifteNamen() {
        return null;
    }
}
