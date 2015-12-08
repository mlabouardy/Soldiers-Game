package decorator;

import model.Soldier;

public class SoldierWithSword extends SoldierDecorator{
	
	public SoldierWithSword(Soldier decoratedSoldier) {
		super(decoratedSoldier);
	}

	@Override
	public void parry(int force) {
		decoratedSoldier.parry(force-5);
	}
	
	@Override
	public int strike() {
		return decoratedSoldier.strike()+1;
	}
}
