package model;

import java.util.ArrayList;
import java.util.List;

import observer.SoldierObserver;
import visitor.SoldierVisitor;
import weapon.Weapon;

public abstract class AbstractSoldier implements Soldier{
	
	private int healthPoints;
	private int force;
	private String name;
	private int nbrOfWeapons=0;
	private List<SoldierObserver> observers;
	
    public AbstractSoldier(String name, int healthPoints, int force) {
    	this.name=name;
		this.healthPoints=healthPoints;
		this.force=force;
		this.observers=new ArrayList<>();
	}
	
	@Override
	public int strike() {
		return isAlive()?force:0;
	}

	@Override
	public boolean isAlive() {
		return healthPoints>0;
	}

	@Override
	public void parry(int force) {
		healthPoints=(healthPoints>force?(healthPoints-force):0);
		if(healthPoints==0)
			notifyObservers();
	}

	@Override
	public int getHealthPoints() {
		return healthPoints;
	}

	public String getName(){
		return name;
	}
	
	public void newWeapon(){
		nbrOfWeapons++;
	}
	
	public int countWeapons(){
		return nbrOfWeapons;
	}
	
	@Override
	public void addWeapon(Weapon weapon) {
		// TODO Auto-generated method stub
		
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
