import se.lth.cs.pt.window.SimpleWindow;

import java.awt.*;

public class LineDrawing {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(500, 500, "LineDrawing");
		w.setLineColor(Color.green);
		w.setLineWidth(6);
		w.moveTo(0, 0);

		while (true) {
			// vänta tills användaren klickar på en musknapp
			w.waitForMouseClick();
			// rita en linje till den punkt där användaren klickade
			int xCoordinate = w.getMouseX();
			int yCoordinate = w.getMouseY();
			w.lineTo(xCoordinate,yCoordinate);
		}
	}
}
