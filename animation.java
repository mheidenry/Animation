import acm.graphics.GCompound;
import acm.graphics.GImage;

public class animation extends GCompound {

//store images in the SRC folder
	GImage e1 = new GImage("e1.jpg");
	GImage e2 = new GImage("e2.jpg");
	GImage e3 = new GImage("e3.jpg");
	GImage e4 = new GImage("e4.jpg");
	GImage e5 = new GImage("e5.jpg");
	GImage e6 = new GImage("e6.jpg");
	GImage e7 = new GImage("e7.jpg");

	public void animateSprite() {

		e1.setVisible(true);
		pause(50);
		e1.setVisible(false);
		e2.setVisible(true);
		pause(50);
		e2.setVisible(false);
		e3.setVisible(true);
		pause(50);
		e3.setVisible(false);
		e4.setVisible(true);
		pause(50);
		e4.setVisible(false);
		e5.setVisible(true);
		pause(50);
		e5.setVisible(false);
		e6.setVisible(true);
		pause(50);
		e6.setVisible(false);
		e7.setVisible(true);
		pause(50);
		e7.setVisible(false);

	}

	public animation() { //this is a constructor and this concept will be 
		//covered in a future lesson.  Note that it has the same name as the class.
		e1.setSize(100, 100);
		e2.setSize(100, 100);
		e3.setSize(100, 100);
		e4.setSize(100, 100);
		e5.setSize(100, 100);
		e6.setSize(100, 100);
		e7.setSize(100, 100);

		e1.setVisible(false);
		e2.setVisible(false);
		e3.setVisible(false);
		e4.setVisible(false);
		e5.setVisible(false);
		e6.setVisible(false);
		e7.setVisible(false);

		add(e1, 0, 0);
		add(e2, 0, 0);
		add(e3, 0, 0);
		add(e4, 0, 0);
		add(e5, 0, 0);
		add(e6, 0, 0);
		add(e7, 0, 0);

	}
}
