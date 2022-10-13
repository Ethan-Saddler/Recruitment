/**
 * @author esaddler3
 * @version 1.0
 * A driver to run the classes and test methods within classes.
 */
public class Headquarters {
    /**
     * The main method that creates many different objects of different classes for testing.
     * @param args can be used in command line to give arguments in an array, but not used in this case.
     */
    public static void main(String[] args) {
        SuperheroRecruit spiderman = new SuperheroRecruit("Spiderman", 100, 200, 150);
        SuperheroRecruit ironman = new SuperheroRecruit("Iron man", 200, 300);
        FlyingHero batman = new FlyingHero("Batman", 150);
        FlyingHero antman = new FlyingHero("Antman", 200, 250, 100, 100);
        Brawler hulk = new Brawler("Hulk", 100);
        Brawler largeman = new Brawler("Large Man", 300);
        Catchphrase phrase = new Catchphrase("wow I sure am cool!!", 15);

        SuperheroRecruit spiderCopy = new SuperheroRecruit(spiderman);

        spiderCopy.setSpeed(1000);

        System.out.println(spiderman);
        System.out.println(spiderCopy);

        System.out.println(spiderman.recruit("Avengers Base"));
        System.out.println(ironman.recruit("Cool Base"));
        System.out.println(batman.recruit("Not Cool Base"));
        System.out.println(antman.recruit("Gaming Base"));
        System.out.println(hulk.recruit("Bruh Base"));
        System.out.println(largeman.recruit("Foo Base"));


        System.out.println(phrase.toString());

        hulk.statChange();

    }
}
