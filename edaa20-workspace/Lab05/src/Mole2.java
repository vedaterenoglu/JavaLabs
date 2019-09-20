import java.awt.*;

public class Mole2 {
    private Graphics g = new Graphics(30, 50, 10);

    public static void main(String[] args) {
        Mole2 m = new Mole2();
        m.drawWorld();
        m.vedat();
    }


    public void drawWorld(){
        g.rectangle(0,0, g.getWidth(),g.getHeight(),Colors.SOIL);
    }

    public void vedat() {
        int x = g.getWidth() / 2;
        int y = g.getHeight() / 2;

        while (true) {
            g.block(x, y, Colors.MOLE);
            char key = g.waitForKey();
            g.block(x, y, Colors.TUNNEL);
            if (key == 'w'){ y--; }
            else if (key == 'a'){ x--; }
            else if (key == 's'){ y++;}
            else if (key == 'd'){ x++; }

        }


    }
}
