package app;

public interface SoldierVisitor {
	public void visit(Horsemen horsemen);
	public void visit(Infrantrymen infrantrymen);
	public void visit(Army army);
	public void visit(DecoratorSoldier decoratorSoldier);
}
