import se.lth.cs.pt.window.SimpleWindow;

public class Answer5 {
    public static void main(String[] args) {
        SimpleWindow w = new SimpleWindow(600, 600, "TurtleDrawSquare");
        Turtle t = new Turtle(w, 300, 300);
        t.penDown();
        for (int i = 0; i < 1000; i++) {
            int step = (int)(Math.random() * 10) + 1;
            int ang = (int)(Math.random() * 360) + 1 -180;
            t.left(ang);
            t.forward(step);
            SimpleWindow.delay(50); // It's for me during development
        }
    }
}

