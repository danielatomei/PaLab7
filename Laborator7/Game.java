public class Game {
    public static void main (String[] args) {
        Board board = new Board (10);
        for (int i = 0; i < 20; i++) {
            board.addTokenToList (new Token (100));
        }
        board.printBoard ();
        Thread t1 = new Thread (new Player ("Tom"));
        Thread t2 = new Thread (new Player ("Jerry"));
        t1.start ();
        t2.start ();
    }
}
