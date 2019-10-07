import se.lth.cs.pt.window.SimpleWindow;

public class Answer6 {
    public static double getDistance(int t1x, int t2x, int t1y, int t2y) {
        double dist;
        dist = (Math.pow((t1x - t2x), 2)) + (Math.pow((t1y - t2y), 2));
        //System.out.println("t1.x: "+ (int)t1x + " t2.x: "+ (int)t2x + " t1.y: "+ (int)t1y + " t2.y: "+ (int)t2y  );
        //System.out.println("Distance: " + dist); // For myself to see the vale on terminal
        return dist;
    }

    public static int getStep() {
        int step = (int) (Math.random() * 10) + 1;
        return step;
    }
    public static int getAngle() {
        int ang = (int) (Math.random() * 360) + 1 - 180;
        return ang;
    }
    public static void main(String[] args) {
        SimpleWindow w = new SimpleWindow(600, 600, "TurtleDrawSquare");
        Turtle t1 = new Turtle(w, 285, 335);
        Turtle t2 = new Turtle(w, 335, 285);
        t1.penDown();
        t2.penDown();
        double distance = getDistance(t1.getX(), t2.getX(), t1.getY(), t2.getY());
        while (distance >= 2500) {
            int step = getStep();
            int ang = getAngle();
            t1.left(ang);
            t1.forward(step);

            step = getStep();
            ang = getAngle();
            t2.left(ang);
            t2.forward(step);

            SimpleWindow.delay(5); // It's for me during development
            distance = getDistance(t1.getX(), t2.getX(), t1.getY(), t2.getY());
        }
    }
}