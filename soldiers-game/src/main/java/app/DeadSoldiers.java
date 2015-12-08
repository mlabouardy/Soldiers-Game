package app;

import java.util.ArrayList;
import java.util.List;

import observer.Observable;
import observer.Observer;

public class DeadSoldiers implements Observer{

	
	public void update(Observable o, String msg) {
		if(o instanceof Army){
			Army army=(Army)o;
			List<Soldier> deadSoldiers=new ArrayList<Soldier>();
			for(Soldier s:army.children()){
				if(!s.isAlive())
					deadSoldiers.add(s);
			}
			for(Soldier s:deadSoldiers)
				System.out.println(s.getName());
		}
	}

}
