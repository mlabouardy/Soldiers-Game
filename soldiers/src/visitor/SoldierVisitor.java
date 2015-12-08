package visitor;

import composite.Army;
import decorator.SoldierDecorator;
import model.Horsmen;
import model.Infantrymen;

public interface SoldierVisitor {
	
	public void visit(Horsmen hm);
	public void visit(Infantrymen im);
	public void visit(SoldierDecorator sd);
	public void visit(Army army);

}
