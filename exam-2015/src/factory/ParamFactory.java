package factory;

import model.Brick;
import model.Brick1x1;
import model.Brick1x2;
import model.Brick1x4;
import model.Brick2x2;

public class ParamFactory implements LegoFactory{
	private Brick b1;
	private Brick b2;
	private Brick b3;
	private Brick b4;
	private Brick b5;
	
	public ParamFactory(Brick b1, Brick b2, Brick b3, Brick b4, Brick b5){
		this.b1=b1;
		this.b2=b2;
		this.b3=b3;
		this.b4=b4;
		this.b5=b5;
	}

	@Override
	public Brick createBrick1x1() {
		return b1.clone();
	}

	@Override
	public Brick createBrick1x2() {
		return b2.clone();
	}

	@Override
	public Brick createBrick1x4() {
		return b3.clone();
	}

	@Override
	public Brick createBrick2x2() {
		return b4.clone();
	}

	@Override
	public Brick createBrick2x4() {
		return b5.clone();
	}
	
	
	
	
}
