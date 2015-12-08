package app;

import observer.Observer;

public interface Soldier {
	public void parry(int force);
	public int strike();
	public int getHealthPoints();
	public boolean isAlive();
	public String getName();
	public void accept(SoldierVisitor visitor);
}
