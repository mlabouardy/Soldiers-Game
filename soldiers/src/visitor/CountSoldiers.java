package visitor;

import composite.Army;
import decorator.SoldierDecorator;
import model.Horsmen;
import model.Infantrymen;
import model.Soldier;
import visitor.SoldierVisitor;

public class CountSoldiers implements SoldierVisitor{
	private int count=0;
	
	@Override
	public void visit(Horsmen hm) {
		count++;
	}

	@Override
	public void visit(Infantrymen im) {
		count++;
	}

	@Override
	public void visit(Army army) {
		for(Soldier s:army.children())
			s.accept(this);
	}

	@Override
	public void visit(SoldierDecorator sd) {
		count++;
	}
	
	public int getResults(){
		return count;
	}

}
