public class Brawler extends SuperheroRecruit {
    
    private Catchphrase catchphrase;
    
    
    public Brawler(String name, int speed) {
        super(name, speed);
        this.catchphrase = null;
    }
    
    
    public Brawler(String name, int speed, double strength, int intelligence, Catchphrase catchphrase) {
        super(name, speed, strength, intelligence);
        this.catchphrase = catchphrase;
    }  
    public Brawler(Brawler hero) {
        super(hero.getName(), hero.getSpeed(), hero.getStrength(), hero.getIntelligence());
    }
    public double powerScaling() {
        double average = (getSpeed() + getStrength() + getIntelligence()) / 3;
        if (catchphrase != null) {
            average += average*(catchphrase.getStatIncrease()/100.0);
        }
        return average;
    }
    public void statChange() {
        System.out.printf("Catchphrase: %s%nOriginal Speed and Strenght: %d and %f%nStat Increase: %f%%nFinal Power Scaling: %d%n", catchphrase.getCatchphrase(), getSpeed(), getStrength(), (catchphrase == null ? 0.0 : catchphrase.getStatIncrease()), powerScaling());
    }

}
