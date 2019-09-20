import se.lth.cs.pt.square.Square;
import se.lth.cs.pt.window.SimpleWindow;

public class Answer9 {
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
            for(int i=1;i<=10;i++) {
                sq.erase(w);
                sq.move(xstep, ystep);
                sq.draw(w);
                SimpleWindow.delay(100);
            }
            x1 = x2;
            y1 = y2;
        }
    }
}
