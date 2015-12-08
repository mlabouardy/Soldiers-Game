package app;

import java.util.ArrayList;
import java.util.List;

import observer.Observable;
import observer.Observer;

public abstract class AbstractSoldier implements Soldier{
	private String name;
	private int healthPoints;
	private int force;
	private List<Observer> observers;
	
	
	public AbstractSoldier(String name, int healthPoints, int force){
		this.name=name;
		this.healthPoints=healthPoints;
		this.force=force;
		observers=new ArrayList<Observer>();
	}
	
	public String getName(){
		return name;
	}
	
	public int getHealthPoints() {
		return healthPoints;
	}
	
	public boolean isAlive(){
		return healthPoints>0;
	}
	
	public void parry(int force) {
		healthPoints=healthPoints>force?(healthPoints-force):0;
		notifyObservers();
	}

	public int strike() {
		return (isAlive()?force:0);
	}
	
	public void addObserver(Observer o){
		observers.add(o);
	}
	
	public void deleteObserver(Observer o){
		observers.remove(o);
	}
	
	public void notifyObservers(){
		for(Observer o:observers)
			o.update(this, "Update !");
	}

}
