public class World {
    private boolean isRaining;
    private int day;// 1 er Mandag, 2 er Tirsdag, ..., 7 for Søndag, 8 er Mandag...

    public World(int day, boolean isRaining) {
        this.day = day;
        this.isRaining = isRaining;
    }

    public void setDay(int day) {
        if(day > 0) {
            this.day = day;
        }
    }

    public boolean isSunday() {
        // Endre metoden slik at den returner true hvis det er søndag (hint: Modulo %)
        return false;
    }

    public boolean getIsRaining() {return this.isRaining;}
    public int getDay() {return this.day;}
}
