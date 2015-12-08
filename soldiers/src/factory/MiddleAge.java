package factory;

import model.Horsmen;
import model.Infantrymen;
import model.Soldier;
import weapon.Shield;
import weapon.Sword;

public class MiddleAge implements SoldierFactory{

	@Override
	public Soldier createInfantryMen(String name) {
		Soldier soldier=new Infantrymen(name);
		soldier.addWeapon(new Shield());
		soldier.addWeapon(new Sword());
		return soldier;
	}

	@Override
	public Soldier createHorsmen(String name) {
		Soldier soldier=new Horsmen(name);
		soldier.addWeapon(new Shield());
		soldier.addWeapon(new Sword());
		return soldier;
	}


}
