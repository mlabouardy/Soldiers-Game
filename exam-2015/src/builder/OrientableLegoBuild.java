package builder;

import java.util.ArrayList;
import java.util.List;

import factory.LegoFactory;
import model.Brick;
import model.OrientableBrick;
import model.Orientation;
import model.Position;

public class OrientableLegoBuild implements LegoBuilder{
	private final int MAX=50;
	private OrientableBrick current;
	private LegoFactory lf;
	private List<OrientableBrick> orientableBricks;
	private int grid[][]=new int[MAX][MAX];
	
	public OrientableLegoBuild(LegoFactory lf){
		this.lf=lf;
		this.orientableBricks=new ArrayList<OrientableBrick>();
	}

	@Override
	public void get1x1() {
		current=new OrientableBrick(lf.createBrick1x1());
	}

	@Override
	public void get1x2() {
		current=new OrientableBrick(lf.createBrick1x2());
	}

	@Override
	public void get2x2() {
		current=new OrientableBrick(lf.createBrick2x2());
	}

	@Override
	public void get1x4() {
		current=new OrientableBrick(lf.createBrick1x4());
	}

	@Override
	public void get2x4() {
		current=new OrientableBrick(lf.createBrick2x4());
		Position position=current.getPosition();
	}

	@Override
	public void moveTo(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rotate(Orientation orientation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drop() {
		// TODO Auto-generated method stub
		
	}

}
