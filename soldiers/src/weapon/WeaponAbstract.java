package weapon;

import decorator.SoldierDecorator;
import model.Soldier;

public abstract class WeaponAbstract implements Weapon{
	private int strength;
	
	public WeaponAbstract(int strength){
		this.strength=strength;
	}
	
	@Override
	public Soldier extendSoldier(Soldier soldier) {
		return new SoldierDecorator(soldier) {
			@Override
			public int strike() {
				return super.strike()+strength;
			}
		};
	}
}
