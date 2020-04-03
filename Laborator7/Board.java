import java.util.*;

/**
 * we use a two dimensional array for maintaining two-dimensional game board
 */
public class Board {
    private static List<Token> tokenList;

    Board () {
        tokenList = new ArrayList<Token> (1);
    }

    Board (int n) {
        tokenList = new ArrayList<Token> (n);
    }

    public static void addTokenToList (Token tok) {
        if (!tokenList.contains(tok)) {
            tokenList.add (tok);
        }
    }

    public static Token removeTok () {
        if (tokenList.size() < 1)
            return null;
        Token tok = tokenList.get (0);
        tokenList.remove (0);
        return tok;
    }

    public void printBoard() {
        System.out.println ("Board: ");
        for (int i = 0; i < tokenList.size(); i++) {
            System.out.printf ("%d ", tokenList.get(i).getNumber());
        }
        System.out.printf ("\n");
    }

}
