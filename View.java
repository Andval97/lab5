package general;

import java.util.Observable;
import java.util.Observer;

import java.util.Observable;
import java.util.Observer;


	/* observat�r av State.
	 * metod update �r tom.
	 * den ska �rvas till en specifik vy som kan f�lja simuleringen i steg.
	 */

	public class View implements Observer {
	
	private State state;
	
	public View(){
		state.addObserver(this);
	}
	
	public void update(Observable arg0, Object f) {
		
	}
}