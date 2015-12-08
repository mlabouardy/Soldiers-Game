package test;

import composite.Army;
import decorator.SoldierWithShield;
import decorator.SoldierWithSword;
import model.Horsmen;
import model.Infantrymen;
import model.Soldier;
import observer.DeadSoldiers;
import observer.DisplayDeadSoldiers;
import observer.Subscribe;
import visitor.CountDeadSoldiers;
import visitor.CountSoldiers;
import visitor.DisplaySoldiers;
import weapon.Sword;

public class Main {
	public static void main(String[] args) {
		Soldier s1=new Horsmen("John");
		Soldier s2=new Infantrymen("Frank");
		
		Army army=new Army("Team 1");
		army.addSoldier(s1);
		army.addSoldier(s2);
		
		Army army2=new Army("Team 2");
		Soldier s3=new Horsmen("Med");
		army2.addSoldier(s3);
		army2.addSoldier(army);
		
		
		Subscribe subscribe=new Subscribe(new DeadSoldiers());
		army2.accept(subscribe);
		Subscribe subscribe2=new Subscribe(new DisplayDeadSoldiers());
		army2.accept(subscribe2);
		
		army2.parry(200);
	}
}
