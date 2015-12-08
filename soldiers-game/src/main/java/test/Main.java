package test;

import app.Army;
import app.CountDeadSoldiers;
import app.CountSoldiers;
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
		
		CountDeadSoldiers cs=new CountDeadSoldiers();
		army.addObserver(cs);
		
	}
}
