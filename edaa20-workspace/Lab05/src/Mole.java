import se.lth.cs.pt.window.SimpleWindow;

public class Mole {
    public static void main(String[] args){
        System.out.println("Keep on digging!");
        Graphics g = new Graphics(30, 50, 10);
        g.square();
        g.block(10,10, Colors.MOLE);
        //g.rectangle(10,20, 15,10,Colors.SOIL); // Just try the method
    }
}


//// Answer 1 and 2
//public class Mole {
//    public static void main(String[] args){
//        System.out.println("Keep on digging!");
//
////        SimpleWindow w = new SimpleWindow(300, 500, "Digging");
////        w.moveTo(10, 10);
////        w.lineTo(10, 20);
////        w.lineTo(20, 20);
////        w.lineTo(20, 10);
////        w.lineTo(10, 10);
//        Graphics g = new Graphics();
//        g.square();
//    }
//}
