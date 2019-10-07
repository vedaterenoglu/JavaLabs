import se.lth.cs.pt.window.SimpleWindow;

public class Turtle {

	/** Skapar en sköldpadda som ritar i ritfönstret w. Från början 
	    befinner sig sköldpaddan i punkten x, y med pennan lyft och 
	    huvudet pekande rakt uppåt i fönstret (i negativ y-riktning). */

	private SimpleWindow w;
	private double x;
	private double y;
	private int direction = 90;
	private boolean isPenActive = false;

	// Constructor
	public Turtle(SimpleWindow w, int x, int y) {
		this.x = x;
		this.y = y;
		this.w = w;
	}

	// Methods (define behavior)

	/** Sänker pennan. */
	public void penDown() {
		isPenActive = true;
	}
	
	/** Lyfter pennan. */
	public void penUp() {
		isPenActive = false;
	}
	
	/** Går rakt framåt n pixlar i den riktning huvudet pekar. */
	public void forward(int n) {
		w.moveTo(getX(), getY());
		x += ((Math.cos(Math.toRadians(direction)) * n));
		y -= ((Math.sin(Math.toRadians(direction)) * n));

		if (isPenActive){
            w.lineTo(getX(), getY());
		} else
			w.moveTo(getX(),getY());
	}

	/** Vrider beta grader åt vänster runt pennan. */
	public void left(int beta) {
		direction += beta;
		direction %= 360;
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
		return (int) Math.round(x);
	}

 	/** Tar reda på y-koordinaten för sköldpaddans aktuella position. */
	public int getY() {
		return (int) Math.round(y);
	}
  
	/** Tar reda på sköldpaddans riktning, i grader från den positiva X-axeln. */
 	public int getDirection() {
		return direction;
	}
}
