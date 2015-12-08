package factory;

import model.Brick;

public interface LegoFactory {

	public Brick createBrick1x1();
	public Brick createBrick1x2();
	public Brick createBrick1x4();
	public Brick createBrick2x2();
	public Brick createBrick2x4();
	
	
}
