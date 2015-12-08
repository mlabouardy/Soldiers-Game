package decorator;

import model.Soldier;

public class SoldierWithShield extends SoldierDecorator{
	
	public SoldierWithShield(Soldier decoratedSoldier) {
		super(decoratedSoldier);
	}

	@Override
	public void parry(int force) {
		decoratedSoldier.parry(force-10);
	}
	
	@Override
	public int strike() {
		return decoratedSoldier.strike();
	}
}
