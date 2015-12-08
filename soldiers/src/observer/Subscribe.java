package observer;

import composite.Army;
import decorator.SoldierDecorator;
import model.Horsmen;
import model.Infantrymen;
import model.Soldier;
import visitor.SoldierVisitor;

public class Subscribe implements SoldierVisitor{

	private SoldierObserver soldierObserver;
	
    public Subscribe(SoldierObserver soldierObserver) {
		this.soldierObserver=soldierObserver;
	}
	
	@Override
	public void visit(Horsmen hm) {
		hm.addObserver(soldierObserver);
	}

	@Override
	public void visit(Infantrymen im) {
		im.addObserver(soldierObserver);
	}

	@Override
	public void visit(SoldierDecorator sd) {
		sd.addObserver(soldierObserver);
	}

	@Override
	public void visit(Army army) {
		for(Soldier s:army.children()){
			s.accept(this);
		}
	}

}
