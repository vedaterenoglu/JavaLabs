import se.lth.cs.pt.window.SimpleWindow;
import se.lth.cs.pt.square.Square;

public class Answer7 {
    public static void main(String[] args) {
        SimpleWindow w = new SimpleWindow(600, 600, "DrawSquare");
        Square sq = new Square(250, 250, 100);
        sq.draw(w);
        while (true) {
            w.waitForMouseClick();
            sq.erase(w);
            int x = w.getMouseX();
            int y = w.getMouseY();
            Square sqn = new Square(x, y, 100);
            sq = sqn;
            sq.draw(w);

        }
    }
}
