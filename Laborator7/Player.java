import java.util.*;
import java.lang.*;
import java.util.concurrent.locks.ReentrantLock;

public class Player implements Runnable {
    private String name;
    private static volatile ReentrantLock lock = new ReentrantLock();
    private static int count = 0;
    private List<Token> tokenList= new ArrayList<>();

    Player (String name) {
        this.name = name;
    }
    public String getName () {
        return name;
    }

    public void printIt () {
        System.out.print (name + "\n");
        for (Token token : tokenList) {
            System.out.printf ("%d ", token.getNumber());
        }
        System.out.printf ("\n");
    }

    @Override
    public void run () {
        Token tok;
        do {
            lock.lock ();
            tok = Board.removeTok ();
            if (tok != null)
                tokenList.add (tok);
            else {
                lock.unlock ();
                break;
            }
            count++;
            int privateCounter = count;
            lock.unlock ();
            while (privateCounter == count);
        } while (tok != null);
        count++;
        lock.lock ();
        printIt ();
        lock.unlock ();
    }
}
