package model;

public class OrientableBrick implements OrientableBrickIt{
	private Brick brick;
	private Position position;
	private Orientation orientation;
	
	public OrientableBrick(Brick brick){
		this.brick=brick;
		this.position=new Position(0,0,0);
		this.orientation=Orientation.NORTH;
	}

	@Override
	public Position getPosition() {
		return position;
	}

	@Override
	public Orientation getOrientation() {
		return orientation;
	}
	
	
}
