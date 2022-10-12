public class FlyingHero extends SuperheroRecruit {
    private double altitude;  

    public FlyingHero(String name) {
        super(name, 20);
        this.altitude = 50;
    }
    public FlyingHero(String name, int speed) {
        super(name, speed);
    }
    public FlyingHero(String name, int speed, double strength, int intelligence, double altitude) {
        super(name, speed, strength, intelligence);
        if (altitude >= 10 && altitude <= 110) {
            this.altitude = altitude;
        } else {
            this.altitude = 50;
        }
    }  
    public double powerScaling() {
        double average = (speed + strength + intelligence + altitude) / 4;
        return average;
    }
    public String toString() {
        String newString = String.format("%s can fly %f feet in the air! %s has %d IQ, runs at %d miles per hour, and can lift %f pounds. The Power Scaling is %f.", name, altitude, name, intelligence, speed, strength, powerScaling());
        return newString;
    }

}
