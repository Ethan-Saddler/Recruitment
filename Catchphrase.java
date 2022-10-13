/**
 * @author esaddler3
 * @version 1.0
 * an object that has fields of the catchphrase and stat increase of that catchphrase for a hero.
 */

public class Catchphrase {
    private final String catchphrase;
    private final double statIncrease;

    /**
     * constructs a Catchphrase object with 2 parameters.
     * @param catchphrase the catchphrase of a hero
     * @param statIncrease the stat increase of the catchphrase
     */
    public Catchphrase(String catchphrase, double statIncrease) {
        if (catchphrase.equals("") || catchphrase == null) {
            this.catchphrase = "I can do this all day";
        } else {
            this.catchphrase = catchphrase;
        }
        if (statIncrease > 0 && statIncrease <= 20) {
            this.statIncrease = statIncrease;
        } else {
            this.statIncrease = 15.0;
        }
    }
    /**
     * takes the catchphrase and stat increase from an object and formats it into a string.
     * @return String that displays the string of the Catchphrase object as well as the stat increase in a sentence
     */
    public String toString() {
        String newString;
        newString = String.format("%s! Stats are increased by %.2f%%.", this.catchphrase, this.statIncrease);
        return newString;
    }
    /**
     * a getter for the double statIncrease.
     * @return double that is the statIncrease of the Catchphrase object
     */
    public double getStatIncrease() {
        return this.statIncrease;
    }
    /**
     * a getter for the String catchphrase.
     * @return the catchphrase of an object
     */
    public String getCatchphrase() {
        return this.catchphrase;
    }
}
