package visitor;

import composite.Army;
import decorator.SoldierDecorator;
import model.Horsmen;
import model.Infantrymen;
import model.Soldier;

public class CountDeadSoldiers implements SoldierVisitor{
	private int count=0;
	
	@Override
	public void visit(Horsmen hm) {
		if(!hm.isAlive())
			count++;
	}

	@Override
	public void visit(Infantrymen im) {
		if(!im.isAlive())
			count++;
	}

	@Override
	public void visit(SoldierDecorator sd) {
		if(!sd.isAlive())
			count++;
	}

	@Override
	public void visit(Army army) {
		for(Soldier s:army.children())
			s.accept(this);
	}
	
	public int getResults(){
		return count;
	}

}
