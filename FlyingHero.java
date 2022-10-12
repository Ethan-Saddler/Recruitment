public class FlyingHero extends SuperheroRecruit {
    private double altitude;  

    public FlyingHero(String name) {
        super(name, 20);
        this.altitude = 50;
    }
    public FlyingHero(String name, int speed) {
        super(name, speed);
        this.altitude = 50;
    }
    public FlyingHero(String name, int speed, double strength, int intelligence, double altitude) {
        super(name, speed, strength, intelligence);
        if (altitude >= 10 && altitude <= 100) {
            this.altitude = altitude;
        } else {
            this.altitude = 50;
        }
    }  
    public FlyingHero(FlyingHero hero) {
        this(hero.getName(), hero.getSpeed(), hero.getStrength(), hero.getIntelligence(), hero.altitude);
    }
    public double powerScaling() {
        double average = (getSpeed() + getStrength() + getIntelligence()) / 3 + altitude;
        return average;
    }
    public String toString() {
        String newString = String.format("%s can fly %.2f feet in the air! %s has %d IQ, runs at %d miles per hour, and can lift %.2f pounds. The Power Scaling is %.2f.%n", getName(), altitude, getName(), getIntelligence(), getSpeed(), getStrength(), powerScaling());
        return newString;
    }

}
