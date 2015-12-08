package app;

public class Infrantrymen extends AbstractSoldier{
	private static final int HEALTH_POINTS=100;
	private static final int FORCE=15;
	
	public Infrantrymen(String name){
		super(name, HEALTH_POINTS, FORCE);
	}

	public void accept(SoldierVisitor visitor) {
		visitor.visit(this);
	}
	
	

}
