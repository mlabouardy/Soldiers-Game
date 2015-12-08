package factory;

import model.Infantrymen;
import model.Soldier;
import weapon.AK47;
import weapon.Laser;
import weapon.Shield;
import weapon.Sword;

public class ScienceFiction implements SoldierFactory{

	@Override
	public Soldier createInfantryMen(String name) {
		Soldier soldier=new Infantrymen(name);
		soldier.addWeapon(new Laser());
		soldier.addWeapon(new AK47());
		return soldier;
	}

	@Override
	public Soldier createHorsmen(String name) {
		Soldier soldier=new Infantrymen(name);
		soldier.addWeapon(new Laser());
		soldier.addWeapon(new AK47());
		return soldier;
	}


}
