package app;

public class CountSoldiers implements SoldierVisitor{
	private int count=0;
	
	public void visit(Horsemen horsemen) {
		count++;
	}

	public void visit(Infrantrymen infrantrymen) {
		count++;
	}

	public void visit(Army army) {
		for(Soldier s:army.children())
			s.accept(this);
	}
	
	public int getResults(){
		return count;
	}
}
