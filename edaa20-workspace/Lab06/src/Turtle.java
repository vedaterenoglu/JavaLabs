import se.lth.cs.pt.window.SimpleWindow;

public class Turtle {

	/** Skapar en sköldpadda som ritar i ritfönstret w. Från början 
	    befinner sig sköldpaddan i punkten x, y med pennan lyft och 
	    huvudet pekande rakt uppåt i fönstret (i negativ y-riktning). */

	int x;
	int y;
	SimpleWindow w;
	boolean isPenActive;
	double dxd;
	double dyd;
	int dx;
	int dy;
	int angel = 90;


	public Turtle(SimpleWindow w, int x, int y) {
		this.x = x;
		this.y = y;
		this.w = w;
		w.moveTo(x, y);

	}

	/** Sänker pennan. */
	public void penDown() {
	    this.isPenActive = true;
	}
	
	/** Lyfter pennan. */
	public void penUp() {
		this.isPenActive = false;

	}
	
	/** Går rakt framåt n pixlar i den riktning huvudet pekar. */
	public void forward(int n) {
		if (this.isPenActive = true){
            dxd = Math.round(Math.cos(Math.toRadians(angel)) * n);
            dyd = Math.round(Math.sin(Math.toRadians(angel)) * n);
            dx = x + (int)dxd;
            dy = y - (int)dyd;
            w.lineTo(dx, dy);
                this.x = dx;
                this.y = dy;
		}
	}

	/** Vrider beta grader åt vänster runt pennan. */
	public void left(int beta) {
	    angel = angel + beta;
		//

	}

	/** Går till punkten newX, newY utan att rita. Pennans läge (sänkt
	    eller lyft) och huvudets riktning påverkas inte. */
	public void jumpTo(int newX, int newY) {
	
	}

	/** Återställer huvudriktningen till den ursprungliga. */
	public void turnNorth() {

	}

	/** Tar reda på x-koordinaten för sköldpaddans aktuella position. */
	public int getX() {
		return 0;
	}

 	/** Tar reda på y-koordinaten för sköldpaddans aktuella position. */
	public int getY() {
		return 0;
	}
  
	/** Tar reda på sköldpaddans riktning, i grader från den positiva X-axeln. */
 	public int getDirection() {
 		return 0;
	}
}
