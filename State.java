package lab5.general;

import java.util.Observable;

/*public class State extends Observable {
	int timePassed;
	boolean simStop;
}*/

import java.util.Observable;

public class State extends Observable {

private boolean emergencyStop = false;
private double time;


public State(){
	this.time = 0;
}

public boolean getEmergencyStop(){ //returnerar n�dbromsens n�r det �r dags att sluta.
	return emergencyStop;
}

public double getTime() { // returnerar tiden.
	return time;
}

public void setTime(double newTime) { // s�tter ett nytt tid av simulatorn 
	this.time = newTime;
}
}