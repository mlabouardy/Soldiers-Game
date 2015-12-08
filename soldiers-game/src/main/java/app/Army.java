package app;

import java.util.ArrayList;
import java.util.List;

import observer.Observable;
import observer.Observer;

public class Army implements Soldier, Observable{
	private String name;
	private List<Soldier> soldiers;
	private List<Observer> observers;
	
	public Army(String name){
		this.name=name;
		soldiers=new ArrayList<Soldier>();
		observers=new ArrayList<Observer>();
	}
	
	public String getName(){
		return name;
	}

	public Soldier getSoldier(int i){
		return soldiers.get(i);
	}
	
	public void addSoldier(Soldier soldier){
		soldiers.add(soldier);
	}
	
	public void removeSoldier(int i){
		soldiers.remove(i);
	}
	
	public List<Soldier> children(){
		return soldiers;
	}
	
	public void parry(int force) {
		for(Soldier s:soldiers){
			s.parry(force);
			notifyObservers();
		}
	}

	public int strike() {
		int sum=0;
		for(Soldier s:soldiers){
			sum+=s.strike();
		}
		return sum;
	}

	public int getHealthPoints() {
		int points=0;
		for(Soldier s:soldiers){
			points+=s.getHealthPoints();
		}
		return points;
	}

	public boolean isAlive() {
		boolean alive=true;
		for(Soldier s:soldiers)
			alive=s.isAlive() || alive;
		return alive;
	}

	public void accept(SoldierVisitor visitor) {
		visitor.visit(this);
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
