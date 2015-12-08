package test;

import app.AddObserver;
import app.Army;
import app.CountDeadSoldiers;
import app.CountSoldiers;
import app.DeadSoldiers;
import app.Horsemen;
import app.Infrantrymen;
import app.Soldier;

public class Main {
	public static void main(String[] args) {
		Soldier hm=new Horsemen("John");
		Soldier im=new Infrantrymen("Frank");
		Army army=new Army("TEAM 1");
		army.addSoldier(hm);
		army.addSoldier(im);
		Army army2=new Army("TEAM 2");
		army2.addSoldier(army);
		
		AddObserver a=new AddObserver();
		army2.accept(a);
		
		
		army2.parry(100);
		
	}
}
