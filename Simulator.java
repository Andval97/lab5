package general;

import java.util.Observable;

/* Denna inneh�ller i princip bara en metod "run" med en loop
	 * som plockar ut den h�ndelse som st�r p� tur ur k�n. 
	 * kommer anropa "utf�r mig"
	 * loopen i simulators metod slutar n�r n�dbromsen aktiverats. 
	 */

public class Simulator extends Observable {

	    boolean simulating;
	    
	    public void breakSimulation() {
	    	simulating = false;
	    }
	}