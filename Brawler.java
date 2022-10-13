/**
 * @author esaddler3
 * @version 1.0
 * This class represents a Brawler, which is a child class of the SuperheroRecruiter.
 * The child class adds the field of a catchphrase object
 */
public class Brawler extends SuperheroRecruit {

    private Catchphrase catchphrase;
    /**
     * this is a 2 argument constructor, taking in the name and speed of the hero and creating a new Brawler object.
     * @param name a String that represents the name of the Brawler
     * @param speed a integer that represents the speed of the Brawler
     */
    public Brawler(String name, int speed) {
        super(name, speed);
        this.catchphrase = null;
    }
    /**
     * this is a 5 argument constructor, taking a name, speed, strength, intelligence and catchphrase of the hero
     * creates a new Brawler object.
     * @param name a String that represents the name of the Brawler
     * @param speed a integer that represents the speed of the Brawler
     * @param strength a double that represents the benchpress of the hero
     * @param intelligence an integer that represents the IQ of the hero
     * @param catchphrase a Catchphrase object that contains a catchphrase as well as a stat increase for the hero
     */
    public Brawler(String name, int speed, double strength, int intelligence, Catchphrase catchphrase) {
        super(name, speed, strength, intelligence);
        this.catchphrase = catchphrase;
    }
    /**
     * this is a copy constructor that makes a deep copy of a Brawler.
     * @param hero represents the Brawler object to be copied
     */
    public Brawler(Brawler hero) {
        this(hero.name, hero.getSpeed(), hero.getStrength(), hero.getIntelligence(), hero.catchphrase);
    }
    /**
     * a method that calculates the relative power of the hero by taking the average of their attributes.
     * @return returns an average representing the combination of the hero's speed, strength and intelligence
     */
    public double powerScaling() {
        double average = (getSpeed() + getStrength() + getIntelligence()) / 3;
        if (catchphrase != null) {
            average += average * (catchphrase.getStatIncrease() / 100.0);
        }
        return average;
    }
    /**
     * a method that simply formats the attributes of a Brawler into a string and prints it to the console.
     */
    public void statChange() {
        System.out.printf("Catchphrase: %s%nOriginal Speed and Strenght: %d and %.2f%nStat Increase: %.2f%%%nFinal "
            +
            "Power Scaling: %.2f%n", (catchphrase == null ? "null" : catchphrase.getCatchphrase()),
            getSpeed(), getStrength(), (catchphrase == null ? 0.0 : catchphrase.getStatIncrease()),
            (catchphrase == null ? 0.0 : powerScaling()));
    }
}
