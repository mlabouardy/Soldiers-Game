package app;

public class AddObserver implements SoldierVisitor{
	private CountDeadSoldiers deadSoldiers=new CountDeadSoldiers();
	
	public void visit(Horsemen horsemen) {
		horsemen.addObserver(deadSoldiers);
	}

	public void visit(Infrantrymen infrantrymen) {
		infrantrymen.addObserver(deadSoldiers);
	}

	public void visit(Army army) {
		for(Soldier s:army.children())
			s.addObserver(deadSoldiers);
	}

}
