package app;

public class Main {
	public static void main(String[] args) {
		Soldier hm=new Horsemen("John");
		Soldier im=new Infrantrymen("Frank");
		Army army=new Army("TEAM 1");
		army.addSoldier(hm);
		army.addSoldier(im);
		army.addSoldier(im);
		CountSoldiers countSoldiers=new CountSoldiers();
		army.accept(countSoldiers);
		System.out.println(countSoldiers.getResults());
	}
}
