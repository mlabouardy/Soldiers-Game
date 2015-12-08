package app;

import observer.Observer;

public class Infrantrymen extends AbstractSoldier{
	private static final int HEALTH_POINTS=200;
	private static final int FORCE=15;
	
	public Infrantrymen(String name){
		super(name, HEALTH_POINTS, FORCE);
	}

	public void accept(SoldierVisitor visitor) {
		visitor.visit(this);
	}

	

}
