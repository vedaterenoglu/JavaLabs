import se.lth.cs.pt.window.SimpleWindow;

import java.awt.*;

public class Graphics {
    private int width;
    private int blockSize;
    private int height;

    private SimpleWindow w;

    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }

    public Graphics(int w, int h, int bs){

        width = w;
        height = h;
        blockSize = bs;

        this.w = new SimpleWindow(width * blockSize,
                height * blockSize,
                "Digging");
    }


    public void square(){
        w.moveTo(10, 10);
        w.lineTo(10, 20);
        w.lineTo(20, 20);
        w.lineTo(20, 10);
        w.lineTo(10, 10);
    }

    public void block (int x, int y, Color color){
        int left = x * blockSize;
        int right = left + blockSize - 1;
        int top = y * blockSize;
        int bottom = top + blockSize - 1;
        w.setLineColor(color);
        for(int row = top; row <= bottom; row ++){
            w.moveTo(left, row);
            w.lineTo(right, row);
        }
    }

    public void rectangle (int x, int y, int width, int height, Color c){
        for (int yy = y; yy < y + height; yy++){
            for(int xx = x; xx < x + width; xx++){
                block(xx, yy, c);
            }
        }
    }

    public char waitForKey() {
        return w.waitForKey();
    }

}

class Colors{
    public static final Color MOLE = new Color(51, 51, 0);
    public static final Color SOIL = new Color(153, 102, 51);
    public static final Color TUNNEL = new Color(204, 153, 102);

}



// Answer 2
//public class Graphics {
//
//    SimpleWindow w = new SimpleWindow(300, 500, "Digging");
//    public void square(){
//        w.moveTo(10, 10);
//        w.lineTo(10, 20);
//        w.lineTo(20, 20);
//        w.lineTo(20, 10);
//        w.lineTo(10, 10);
//    }
//}