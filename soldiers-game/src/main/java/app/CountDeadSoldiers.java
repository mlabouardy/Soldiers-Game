package app;

import observer.Observable;
import observer.Observer;

public class CountDeadSoldiers implements Observer{
	private int count=0;
	
	public void update(Observable o, String msg) {
		if(o instanceof Army){
			Army army=(Army)o;
			for(Soldier s:army.children()){
				if(!s.isAlive())
					count++;
			}
			System.out.println("Dead soldiers numbers are "+count);
		}
	}

}
