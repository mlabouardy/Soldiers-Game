package factory;

import model.Soldier;

public interface SoldierFactory {

	public Soldier createInfantryMen(String name);
	
	public Soldier createHorsmen(String name);
}
