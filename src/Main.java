public class Main {
    public static void main(String[] args) {
        // Oppretter en Verden-objekt (omgivelsene)
        World todaysWorld = new World(7, false);

        // Opprett to Robot-objekter

        // med navn, f.eks. Dancatron 4000 og Spark-E
        // med botType "B-Bot" og "Toaster"
        // med forskjellig batterinivå
        // med forskjellig avstand til parken
        // print ut statusen til begge robottene

        // Sjekk om robotene kan gå til danseklubben
        // Sjekk om robotene kan gå til parken
        Robot Dancatron4000 = new Robot("Dancatron 4000 " , 100, 250 , "B-Bot");
        Robot SparkE = new Robot ("SparkE " , 75, 5, "Toaster" );
        Dancatron4000.reportStatus();
        System.out.println();
        SparkE.reportStatus();
        System.out.println();
        Dancatron4000.canWalkToThePark(todaysWorld);
        System.out.println();
        SparkE.canWalkToThePark(todaysWorld);
        System.out.println();
        Dancatron4000.canDanceAtClub(todaysWorld);
        System.out.println();
        SparkE.canDanceAtClub(todaysWorld);



    }
}
