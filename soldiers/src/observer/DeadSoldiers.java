package observer;

public class DeadSoldiers implements SoldierObserver{
	private int count=0;
	
	@Override
	public void update(MyObservable o) {
		count++;
		System.out.println("Dead soldiers are "+count);
		
	}

}
