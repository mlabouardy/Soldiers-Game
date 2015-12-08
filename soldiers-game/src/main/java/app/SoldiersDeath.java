package app;

import java.util.ArrayList;
import java.util.List;

import observer.Observable;
import observer.Observer;

public class SoldiersDeath implements Observer{
	public List<Soldier> deadSoldiers;
	
	public SoldiersDeath(){
		deadSoldiers=new ArrayList<Soldier>();
	}
	
	public void update(Observable o, String msg) {
		if(o instanceof Army){
			Army army=(Army)o;
			for(Soldier s:army.children()){
				if(!s.isAlive())
					deadSoldiers.add(s);
			}
			printNames();
		}
	}
	
	public void printNames(){
		for(Soldier s:deadSoldiers)
			System.out.println(s.getName());
	}

}
