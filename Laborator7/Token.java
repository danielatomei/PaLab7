import java.util.*;

public class Token {
    private int number;

    /**
     * When the Token is blank, it can take the place of any number
     */
    public Token () {
        Random random = new Random ();
        this.number = random.nextInt (999999) + 1;
    }

    /**
     * It takes a number between 1 and m
     * @param m maximum number that number can hold
     */
    public Token (int m) {
        Random random = new Random ();
        this.number = random.nextInt(m) + 1;
    }

    public void setNumber (int number) {
        this.number = number;
    }

    public int getNumber () {
        return number;
    }

}
