package factory;

import model.Brick;
import model.Brick1x1;
import model.Brick1x2;
import model.Brick1x4;
import model.Brick2x2;
import model.Brick2x4;

public class LegoPompier implements LegoFactory{
	private int color=0x0000FF;
	
	@Override
	public Brick createBrick1x1() {
		return new Brick1x1(color);
	}

	@Override
	public Brick createBrick1x2() {
		return new Brick1x2(color);
	}

	@Override
	public Brick createBrick1x4() {
		return new Brick1x4(color);
	}

	@Override
	public Brick createBrick2x2() {
		return new Brick2x2(color);
	}

	@Override
	public Brick createBrick2x4() {
		return new Brick2x4(color);
	}

}
