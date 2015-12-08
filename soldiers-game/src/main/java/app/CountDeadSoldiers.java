package app;

import observer.Observable;
import observer.Observer;

public class CountDeadSoldiers implements Observer {
	private int count=0;
	
	public void update(Observable o, String msg) {
		if(o instanceof Soldier){
			Soldier s=(Soldier)o;
			if(!s.isAlive())
				count++;
			System.out.println(s.getName());
			System.out.println("Dead soldiers numbers are "+count);
		}
	}
	
	public int getNbrOfDeadSoldiers(){
		return count;
	}

}
