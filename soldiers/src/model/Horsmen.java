package model;

import observer.SoldierObserver;
import visitor.SoldierVisitor;

public class Horsmen extends AbstractSoldier{
	private static final int HEALTH_POINTS=200;
	private static final int FORCE=25;

	public Horsmen(String name){
		super(name, HEALTH_POINTS, FORCE);
	}
	
	public void accept(SoldierVisitor visitor){
		visitor.visit(this);
	}

	
}
