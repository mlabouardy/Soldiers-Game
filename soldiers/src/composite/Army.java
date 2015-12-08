package composite;

import java.util.ArrayList;
import java.util.List;

import model.Soldier;
import observer.MyObservable;
import observer.SoldierObserver;
import visitor.SoldierVisitor;
import weapon.Weapon;

public class Army implements Soldier, MyObservable{
	
	private String name;
	private List<Soldier> soldiers;
	private List<SoldierObserver> observers;
	
	public Army(String name){
		this.name=name;
		this.soldiers=new ArrayList<>();
		this.observers=new ArrayList<>();
	}
	
	public void addSoldier(Soldier soldier){
		soldiers.add(soldier);
	}
	
	public List<Soldier> children(){
		return soldiers;
	}
	
	public void removeSoldier(Soldier soldier){
		soldiers.remove(soldier);
	}

	@Override
	public int strike() {
		int sum=0;
		for(Soldier s:soldiers)
			sum+=s.strike();
		return sum;
	}

	@Override
	public boolean isAlive() {
		boolean alive=true;
		for(Soldier s:soldiers)
			alive=s.isAlive() || alive;
		return alive;
	}

	@Override
	public void parry(int force) {
		for(Soldier s:soldiers){
			s.parry(force);
			if(!s.isAlive())
				notifyObservers();
		}
	}

	@Override
	public int getHealthPoints() {
		int points=0;
		for(Soldier s:soldiers)
			points+=s.getHealthPoints();
		return points;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void newWeapon() {
		for(Soldier s:soldiers)
			s.newWeapon();
	}

	@Override
	public int countWeapons() {
		int c=0;
		for(Soldier s:soldiers)
			c+=s.countWeapons();
		return c;
	}

	public void addWeapon(Weapon weapon){
		for(Soldier s:soldiers)
			s.addWeapon(weapon);
	}
	
	public void accept(SoldierVisitor visitor){
		visitor.visit(this);
	}

	@Override
	public void addObserver(SoldierObserver o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(SoldierObserver o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for(SoldierObserver o:observers)
			o.update(this);
	}
	
}
