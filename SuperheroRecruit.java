public class SuperheroRecruit {
    protected final String name;
    private int speed;
    private final double strength;
    private int intelligence;
    private static int totalRecruits = 10;


    public SuperheroRecruit(String name, int speed) {
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
        this.strength = 220;
        this.intelligence = 100;
    }
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
    public SuperheroRecruit(String name, int speed, double strength, int intelligence) {
        this(name, speed, strength);
        if (intelligence > 0) {
            this.intelligence = intelligence;
        }
    }
    public SuperheroRecruit(SuperheroRecruit hero) {
        this(hero.name, hero.speed, hero.strength, hero.intelligence);
    }
    public double powerScaling() {
        double power = (speed + strength + intelligence) / 3;
        return power;
    }
    public String toString() {
        String newString = String.format("%s has %d IQ, runs at %d miles per hour, and can lift %.2f pounds. The Power Scaling is %.2f.%n", name, intelligence, speed, strength, powerScaling());
        return newString;
    }
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
    public int getSpeed() {
        return this.speed;
    }
    public String getName() {
        return this.name;
    }
    public int getIntelligence() {
        return this.intelligence;
    }
    public double getStrength() {
        return this.strength;
    }
}
