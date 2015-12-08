package app;

public class DecoratorSoldier implements Soldier{
	private Soldier soldier;
	
	public DecoratorSoldier(Soldier soldier){
		this.soldier=soldier;
	}
	
	public void parry(int force) {
		soldier.parry(force);
	}

	public int strike() {
		return soldier.strike();
	}

	public int getHealthPoints() {
		return soldier.getHealthPoints();
	}

	public boolean isAlive() {
		return soldier.isAlive();
	}

	public void accept(SoldierVisitor visitor) {
		visitor.visit(this);
	}

	public String getName() {
		return soldier.getName();
	}

}
