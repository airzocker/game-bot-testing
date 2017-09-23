import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			Thread.sleep(5000);
			
			Robot keybot = new Robot();
			
			int anzahl = 1;
			int anzahlCounter = anzahl;
			while(anzahlCounter > 0) {
			keybot.mousePress(InputEvent.BUTTON1_MASK);
		    keybot.mouseRelease(InputEvent.BUTTON1_MASK);
		    anzahlCounter--;
			}
			anzahlCounter = anzahl;

		} catch (AWTException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("finished");
		
	}

}
