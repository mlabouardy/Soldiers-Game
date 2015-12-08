package observer;

import model.Soldier;
import java.util.ArrayList;
import java.util.List;

import composite.Army;

public class DisplayDeadSoldiers implements SoldierObserver{
	private List<Soldier> deadSoldiers;
	
	public DisplayDeadSoldiers() {
		deadSoldiers=new ArrayList<>();
	}
	
	@Override
	public void update(MyObservable o) {
		if(o instanceof Army){
			Army army=(Army)o;
			deadSoldiers.addAll(army.children());
		}else{
			Soldier soldier=(Soldier)o;
			deadSoldiers.add(soldier);
		}
		show();
	}
	
	public void show(){
		for(Soldier s:deadSoldiers)
			System.out.println(s.getName());
	}

}
