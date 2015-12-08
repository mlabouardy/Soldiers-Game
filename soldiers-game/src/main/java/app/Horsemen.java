package app;

public class Horsemen extends AbstractSoldier{
	private static final int HEALTH_POINTS=100;
	private static final int FORCE=20;
	
	public Horsemen(String name) {
		super(name, HEALTH_POINTS, FORCE);
	}

	public void accept(SoldierVisitor visitor) {
		visitor.visit(this);
	}

}
