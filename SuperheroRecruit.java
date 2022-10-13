/**
 * @author esaddler3
 * @version 1.0
 * A parents class with 2 children which represents a new hero recruit.
 * Contains a name, speed, strength, intelligence and a static integer, total recruits.
 */
public class SuperheroRecruit {
    protected final String name;
    private int speed;
    private final double strength;
    private int intelligence;
    private static int totalRecruits = 10;

    /**
     * a contructor that takes in two paramteres and sets the rest to default.
     * also checks to make sure that name and speed are valid.
     * @param name a String that represents the name of the hero
     * @param speed an integer that represents the speed of the hero
     */
    public SuperheroRecruit(String name, int speed) {
        if (name == null || name.equals("")) {
            this.name = "Steve Rogers";
        } else {
            this.name = name;
        }
        if (speed < 0) {
            this.speed = 20;
        } else {
            this.speed = speed;
        }
        this.strength = 220;
        this.intelligence = 100;
    }
    /**
     * a contructor that takes in three paramteres and sets the rest to default.
     * checks to make sure that name, strength and speed are valid.
     * @param name a String that represents the name of the hero
     * @param speed an integer that represents the speed of the hero
     * @param strength a double that represents the bench of a hero
     */
    public SuperheroRecruit(String name, int speed, double strength) {
        if (name.equals("") || name == null) {
            this.name = "Steve Rogers";
        } else {
            this.name = name;
        }
        if (speed < 0) {
            this.speed = 20;
        } else {
            this.speed = speed;
        }
        this.strength = (strength > 0) ? strength : 220;
        this.intelligence = 100;
    }
    /**
     * a contructor that takes in four paramteres and sets the rest to default.
     * checks to make sure that name, strength, intelligence and speed are valid.
     * @param name a String that represents the name of the hero
     * @param speed an integer that represents the speed of the hero
     * @param strength a double that represents the bench of a hero
     * @param intelligence an integer that represents the IQ of the hero
     */
    public SuperheroRecruit(String name, int speed, double strength, int intelligence) {
        this(name, speed, strength);
        if (intelligence > 0) {
            this.intelligence = intelligence;
        }
    }
    /**
     * a copy constructor that makes a deep copy of a SuperheroRecruit object.
     * @param hero a SuperheroRecruit object that is copied.
     */
    public SuperheroRecruit(SuperheroRecruit hero) {
        this(hero.name, hero.speed, hero.strength, hero.intelligence);
    }
    /**
     * a method that calculates the relative power of the hero by taking the average of their attributes.
     * @return returns an average that represents the hero's power level
     */
    public double powerScaling() {
        double power = (speed + strength + intelligence) / 3;
        return power;
    }
    /**
     * takes the attributes of the object and formats it into a string.
     * @return a String that displays the attributes of the object in a sentence and rounds doubles.
     */
    public String toString() {
        String newString = String.format("%s has %d IQ, runs at %d miles per hour, and can lift %.2f pounds. "
            +
            "The Power Scaling is %.2f.%n", name, intelligence, speed, strength, powerScaling());
        return newString;
    }
    /**
     * checks if a hero meets the requirements to be enlisted, then assigns them to a station that is a parameter.
     * also creates a string that contains the information that is processed.
     * @param station a String that represents the station that a recruit is enlisted to.
     * @return String that represents the information (accepted and where they are going or message for why rejected)
     */
    public String recruit(String station) {
        String newString = "";
        if (totalRecruits != 0 && powerScaling() > 120) {
            newString = toString() + String.format("Recruit is enlisted to %s%n", station);
        } else if (totalRecruits  == 0) {
            newString = "Cannot recruit anyone, there are no slots left!";
        } else if (powerScaling() < 120) {
            newString = "Rejected. Take a look at our sidekick program!";
        }
        totalRecruits -= 1;
        return newString;
    }
    /**
     * a getter method that returns the speed of a hero.
     * @return an integer speed that represents the speed of a hero
     */
    public int getSpeed() {
        return this.speed;
    }
    /**
     * a getter method that returns the intelligence of a hero.
     * @return an integer intelligence that represents the IQ of a hero
     */
    public int getIntelligence() {
        return this.intelligence;
    }
    /**
     * a getter method that returns the strength of a hero.
     * @return a double strength that represents the bench of a hero
     */
    public double getStrength() {
        return this.strength;
    }
    /**
     * a getter method that returns the totalRecruits.
     * @return an int that represents the total number of recruits left.
     */
    public static int getTotalRecruits() {
        return totalRecruits;
    }
    /**
     * a setter method that changes the speed of a hero from anoter class.
     * @param speed an integer representing the speed of a hero
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

}
