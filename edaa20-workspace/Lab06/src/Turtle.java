import se.lth.cs.pt.window.SimpleWindow;

public class Turtle {

	/** Skapar en sköldpadda som ritar i ritfönstret w. Från början 
	    befinner sig sköldpaddan i punkten x, y med pennan lyft och 
	    huvudet pekande rakt uppåt i fönstret (i negativ y-riktning). */

	SimpleWindow w;
	double x;
	double y;
	int angle = 0;
	int direction = 90;
	int dn;
	boolean isPenActive = false;

	// Constructor
	public Turtle(SimpleWindow w, int x, int y) {
		this.x = x;
		this.y = y;
		this.w = w;
	}

	// Methods (define behavior)

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
		this.dn = n;

		if (this.isPenActive == true){
			w.moveTo((int) Math.round(x), (int) Math.round(y));

			double x1 = x + ((Math.cos(Math.toRadians(this.direction)) * dn));
			double y1 = y - ((Math.sin(Math.toRadians(this.direction)) * dn));

            w.lineTo((int) Math.round(x1), (int) Math.round(y1));
            this.x = x1;
            this.y = y1;
		}
	}

	/** Vrider beta grader åt vänster runt pennan. */
	public void left(int beta) {
		this.direction = (this.direction + beta) % 360;
	}

	/** Går till punkten newX, newY utan att rita. Pennans läge (sänkt
	    eller lyft) och huvudets riktning påverkas inte. */
	public void jumpTo(int newX, int newY) {

		this.x = newX;
		this.y = newY;
		//w.moveTo(newX, newY);
	}

	/** Återställer huvudriktningen till den ursprungliga. */
	public void turnNorth() {
		this.direction = 90;
	}

	/** Tar reda på x-koordinaten för sköldpaddans aktuella position. */
	public int getX() {
		double x1 = this.x;
		return (int) Math.round(x1);
	}

 	/** Tar reda på y-koordinaten för sköldpaddans aktuella position. */
	public int getY() {

		double y1 = y;
		return (int) Math.round(y1);
	}
  
	/** Tar reda på sköldpaddans riktning, i grader från den positiva X-axeln. */
 	public int getDirection() {
		int dir = this.direction;
 		return dir;
	}
}
