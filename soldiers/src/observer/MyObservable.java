package observer;

public interface MyObservable {

	public void addObserver(SoldierObserver o);
	
	public void removeObserver(SoldierObserver o);
	
	public void notifyObservers();
}
