public class SuperheroRecruit {
    protected String name;
    protected int speed;
    protected double strength;
    protected int intelligence;
    protected int totalRecruits = 10;


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
        this(name, speed);
        if (strength > 0) {
            this.strength = strength;
        }
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
        String newString = String.format("%s has %d IQ, runs at %d miles per hour, and can lift %f pounds. The Power Scaling is %f.", name, intelligence, speed, strength, powerScaling());
        return newString;
    }
    public String recruit(String station) {
        String newString = "";
        if (totalRecruits != 0 && powerScaling() > 120) {
            newString = toString() + String.format("Recruit is enlisted to %s", station);
        } else if (totalRecruits  == 0) {
            newString = "Cannot recruit anyone, there are no slots left!";
        } else if (powerScaling() < 120) {
            newString = "Rejected. Take a look at our sidekick program!";
        }
        totalRecruits -= 1;
        return newString;
    }
}
