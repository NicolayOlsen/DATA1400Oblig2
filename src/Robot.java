public class Robot {
    // gi robotten 4 attributter: name, batteryLevel, distancetoPark og botType
    private String name;
    private double batteryLevel;
    private int distancetoPark;
    private String botType;

    public Robot(String name, int batteryLevel, int distancetoPark, String botType) {
        this.name = name;
        this.batteryLevel = batteryLevel;
        this.distancetoPark = distancetoPark;
        this.botType = botType;
    }

    public String getName() {
        return this.name;
    }

    public double getBatteryLevel() {
        return this.batteryLevel;
    }

    public int getDistancetoPark() {
        return this.distancetoPark;
    }

    public String getBotType() {
        return this.botType;
    }

    public void setBatteryLevel(double batteryLevel) {
        if(batteryLevel >= 0.0 && batteryLevel <= 100.0) {
            this.batteryLevel = batteryLevel;
        }
    }

    public void setDistancetoPark(int distancetoPark) {
        if(distancetoPark > 0) {
            this.distancetoPark = distancetoPark;
        }
    }

    public String reportStatus() {
        // Metode for å rapportere statusen til robotten
        
        // Endre metoden slik at den retunerer en tekst streng som forklarer statusen til roboten
        // eksempel: Dette er bot Dancatron 4000 av type B-Bot.
        // Denne enheten har 80.0 batterikapasitet igjen og bor 1500 meter fra parken.
        String message = "Dette er bot " + this.name + " av type " + this.botType +
                ". Denne enheten har " + this.batteryLevel + " batterikapasitet igjen og bor "
                + this.distancetoPark + " meter fra parken.";
        return message;
    }

    public boolean canWalkToThePark(World world) {
        // Metode for å sjekke om roboten kan gå til parken basert på omgivelsene

        System.out.println(this.name + " sjekker om det er mulig å gå til parken...");

        // Sjekk om det regner
        if (world.getIsRaining()) {
            // skriv ut hvorfor boten ikke kan gå i parken med System.out.println
            System.out.println("Kan ikke gå til parken, det regner");
            return false;
        }

        // Sjekk om det er søndag. Kan bare gå i parken på søndager.
        if(world.isSunday()) {

        }

        // Sjekk batterinivå. En bot trenger 1% batterinivå per 100 meter for å gå til parken.

        return true;
    }


    // lag en metode som heter canDanceAtClub, som sjekker om boten kan være med på danseklubben
       // bottypen må være av type B-Bot (hint .equals)
       // En bot trenger minimum 50% batterikapasitet for å være med
       // Det kan ikke være mandag. Da er danseklubben stengt.
}
