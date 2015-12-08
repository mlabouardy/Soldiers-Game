package model;

import observer.SoldierObserver;
import visitor.SoldierVisitor;

public class Infantrymen extends AbstractSoldier{
	private static final int HEALTH_POINTS=100;
	private static final int FORCE=15;
	
	public Infantrymen(String name){
		super(name, HEALTH_POINTS, FORCE);
	}
	
	public void accept(SoldierVisitor visitor){
		visitor.visit(this);
	}
	

}
