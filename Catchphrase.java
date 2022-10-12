public class Catchphrase {
    final private String catchphrase;
    final private double statIncrease;

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
    public String toString() {
        String newString;
        newString = String.format("%s! Stats are increased by %.2f%.", catchphrase, statIncrease);
        return newString;
    }
    public double getStatIncrease() {
        return this.statIncrease;
    }
    public String getCatchphrase() {
        return this.catchphrase;
    }
}
