package app;


public abstract class AbstractSoldier implements Soldier{
	private String name;
	private int healthPoints;
	private int force;
	
	public AbstractSoldier(String name, int healthPoints, int force){
		this.name=name;
		this.healthPoints=healthPoints;
		this.force=force;
	}
	
	public String getName(){
		return name;
	}
	
	public int getHealthPoints() {
		return healthPoints;
	}
	
	public boolean isAlive(){
		return healthPoints>0;
	}
	
	public void parry(int force) {
		healthPoints=healthPoints>force?(healthPoints-force):0;
	}

	public int strike() {
		return (isAlive()?force:0);
	}

}
