
public class Headquarters {


    public static void main(String[] args) {
        SuperheroRecruit spiderman = new SuperheroRecruit("Spiderman", 100, 200, 150);
        SuperheroRecruit ironman = new SuperheroRecruit("Iron man", 200, 300);
        FlyingHero batman = new FlyingHero("Batman", 150);
        FlyingHero antman = new FlyingHero("Antman", 200, 250, 100, 100);
        Brawler hulk = new Brawler("Hulk", 100);
        Brawler largeman = new Brawler("Large Man", 300);
        Catchphrase phrase = new Catchphrase("wow I sure am cool!!", 15);
    
        SuperheroRecruit spirderCopy = new SuperheroRecruit(spiderman);
        FlyingHero batmanCopy = new FlyingHero(batman);
        Brawler hulkCopy = new Brawler(hulk);

        System.out.println(spiderman.recruit("Avengers Base"));
        System.out.println(ironman.recruit("Avengers Base"));
        System.out.println(batman.recruit("Avengers Base"));
        System.out.println(antman.recruit("Avengers Base"));
        System.out.println(hulk.recruit("Avengers Base"));
        System.out.println(largeman.recruit("Avengers Base"));

        hulk.statChange();

    }    


}
