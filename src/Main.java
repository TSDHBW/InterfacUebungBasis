public class Main {

    public static void main(String[] args) {

        Pferd pferd = new Pferd(30, 80, 120, 900, "Max", "Pferd");
        Schrank schrank = new Schrank (120, 200, 200, 400, "Schlafzimmerschrank", 31);
        Uhr uhr = new Uhr (4, 5, 2, 1, "Apple Watch", 32);

        double transportkosten = ermittleBetrag(pferd) + ermittleBetrag(schrank) + ermittleBetrag(uhr);
        System.out.println(transportkosten);

    }

    public static double ermittleBetrag (Transport transportDetails){

        double betrag = Transport.BASISPREIS;
        betrag = betrag + transportDetails.getBreite()*0.1;
        betrag = betrag + transportDetails.getHoehe()*0.1;
        betrag = betrag + transportDetails.getLaenge()*0.1;
        betrag = betrag + transportDetails.getGewicht()*0.2;
        return betrag;

    }

}
