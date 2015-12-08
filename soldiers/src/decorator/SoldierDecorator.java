package decorator;

import java.util.ArrayList;
import java.util.List;

import exception.MaxWeaponException;
import model.Soldier;
import observer.SoldierObserver;
import visitor.SoldierVisitor;
import weapon.Weapon;

public abstract class SoldierDecorator implements Soldier{
	private final int MAX_WEAPON=2;
	protected Soldier decoratedSoldier;
	private List<SoldierObserver> observers;
	
	public SoldierDecorator(Soldier decoratedSoldier) throws MaxWeaponException{
		this.decoratedSoldier=decoratedSoldier;
		if(decoratedSoldier.countWeapons()==MAX_WEAPON)
			throw new MaxWeaponException();
		decoratedSoldier.newWeapon();
		this.observers=new ArrayList<>();
	}

	@Override
	public int strike() {
		return decoratedSoldier.strike();
	}

	@Override
	public boolean isAlive() {
		return decoratedSoldier.isAlive();
	}

	@Override
	public void parry(int force) {
		decoratedSoldier.parry(force);
	}

	@Override
	public int getHealthPoints() {
		return decoratedSoldier.getHealthPoints();
	}

	@Override
	public String getName() {
		return decoratedSoldier.getName();
	}
	
	public void newWeapon(){
		decoratedSoldier.newWeapon();
	}
	
	public int countWeapons(){
		return decoratedSoldier.countWeapons();
	}
	
	public void addWeapon(Weapon weapon){
		decoratedSoldier.addWeapon(weapon);
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
