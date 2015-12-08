package model;

import observer.MyObservable;
import visitor.SoldierVisitor;
import weapon.Weapon;

public interface Soldier extends MyObservable{
	int strike();
	boolean isAlive();
	void parry(int force);
	int getHealthPoints();
	String getName();
	void newWeapon();
	int countWeapons();
	void addWeapon(Weapon weapon);
	
	void accept(SoldierVisitor visitor);
}
