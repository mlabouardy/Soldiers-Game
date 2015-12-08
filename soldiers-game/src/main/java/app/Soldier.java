package app;

import observer.Observable;
import observer.Observer;

public interface Soldier extends Observable {
	public void parry(int force);
	public int strike();
	public int getHealthPoints();
	public boolean isAlive();
	public String getName();
	public void accept(SoldierVisitor visitor);
}
