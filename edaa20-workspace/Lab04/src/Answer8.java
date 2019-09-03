import se.lth.cs.pt.window.SimpleWindow;
import se.lth.cs.pt.square.Square;

public class Answer8 {
    public static void main(String[] args) {
        SimpleWindow w = new SimpleWindow(600, 600, "DrawSquare");
        int x1 = 50;
        int y1 = 50;
        Square sq = new Square(x1, y1, 100);
        sq.draw(w);
        while (true) {
            w.waitForMouseClick();

            int x2 = w.getMouseX();
            int y2 = w.getMouseY();
            int xstep = (x2 - x1) / 10;
            int ystep = (y2 - y1) / 10;
            for(int i=1;i<=9;i++) {
                Square sqn = new Square((x1 + (xstep * i)), (y1 + (ystep * i)), 100);
                sqn.draw(w);
            }
            Square sqlast = new Square(x2, y2, 100);
            sqlast.draw(w);

        }
    }
}
