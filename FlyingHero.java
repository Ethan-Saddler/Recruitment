/**
 * @author esaddler3
 * @version 1.0
 * This class represents a Flying Hero, which is a child class of the SuperheroRecruiter.
 * The child class adds the field of a double named altitude.
 */
public class FlyingHero extends SuperheroRecruit {
    private double altitude;

    /**
     * this is a constructor that creates a flying hero object with one parameter.
     * and assigns the rest to default values.
     * @param name a String that is the name of the Flying Hero
     */
    public FlyingHero(String name) {
        super(name, 20);
        this.altitude = 50;
    }
    /**
     * a constructor that creates a flying hero object with two parameters.
     * and assigns the rest to default values.
     * @param name a String that represents the name of the Flying Hero
     * @param speed an int that represents the speed of the Flying Hero
     */
    public FlyingHero(String name, int speed) {
        super(name, speed);
        this.altitude = 50;
    }
    /**
     * a contructor that creates a flying hero with 5 parameters.
     * @param name a String that represents the name of the Flying Hero
     * @param speed an int that represents the speed of the Flying Hero
     * @param strength a double that represents the bench press of the Flying Hero
     * @param intelligence an int that represents the IQ of the Flying Hero
     * @param altitude a double that represents how high the Flying Hero can fly.
     * If it is not within a set range it will default to 50.
     */
    public FlyingHero(String name, int speed, double strength, int intelligence, double altitude) {
        super(name, speed, strength, intelligence);
        if (altitude >= 10 && altitude <= 100) {
            this.altitude = altitude;
        } else {
            this.altitude = 50;
        }
    }
    /**
     * a constructor that makes a deep copy of a Flying Hero object.
     * @param hero a Flying Hero object that is to be copied.
     */
    public FlyingHero(FlyingHero hero) {
        this(hero.name, hero.getSpeed(), hero.getStrength(), hero.getIntelligence(), hero.altitude);
    }
    /**
     * a method that calculates the relative power of the hero.
     * this is done by taking the average of their attributes and adding altitude.
     * @return returns an average that represents the hero's power level
     */
    public double powerScaling() {
        double average = (getSpeed() + getStrength() + getIntelligence()) / 3 + altitude;
        return average;
    }
    /**
     * takes the attributes of the object and formats it into a string.
     * @return a String that displays the attributes of the object in a fun sentence.
     */
    public String toString() {
        String newString = String.format("%s can fly %.2f feet in the air! %s has %d IQ, runs"
            +
            "at %d miles per hour, and can lift %.2f pounds. "
            +
            "The Power Scaling is %.2f.%n",
            name, altitude, name, getIntelligence(), getSpeed(), getStrength(), powerScaling());
        return newString;
    }

}
