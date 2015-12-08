package visitor;

import composite.Army;
import decorator.SoldierDecorator;
import model.Horsmen;
import model.Infantrymen;
import model.Soldier;

public class DisplaySoldiers implements SoldierVisitor{

	@Override
	public void visit(Horsmen hm) {
		System.out.println(hm.getName()+" "+hm.getHealthPoints());
	}

	@Override
	public void visit(Infantrymen im) {
		System.out.println(im.getName()+" "+im.getHealthPoints());
	}

	@Override
	public void visit(SoldierDecorator sd) {
		System.out.println(sd.getName()+" "+sd.getHealthPoints());
	}

	@Override
	public void visit(Army army) {
		for(Soldier s:army.children())
			s.accept(this);
	}

}
