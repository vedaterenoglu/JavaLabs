import se.lth.cs.pt.window.SimpleWindow;
import se.lth.cs.pt.square.Square;

public class Answer5 {
    public static void main(String[] args) {
        SimpleWindow w2 = new SimpleWindow(500, 500, "DrawSquare");
        Square sq4 = new Square(250, 250, 100);
        Square sq5 = new Square(200, 275, 100);
        // Square sq6 = new Square(225, 300, 100);
        Square sq6 = null;
        sq4.draw(w2);
        sq5.draw(w2);
        sq6.draw(w2);
    }
}