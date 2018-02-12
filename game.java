import acm.program.GraphicsProgram;

public class game extends GraphicsProgram {

	animation anim; //declares a new object from the animation file

	public void run() {

		setSize(500,500);

		anim = new animation(); //initializes the new object
		
		add(anim, 100, 100); //add the object to the screen
		
		waitForClick();

		while (true) {
			anim.animateSprite(); //calls the object's method
			pause(250);
		}
	}

}
