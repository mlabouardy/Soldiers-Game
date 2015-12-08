package builder;

import model.Orientation;

public interface LegoBuilder {

	public void get1x1();
	public void get1x2();
	public void get2x2();
	public void get1x4();
	public void get2x4();
	
	public void moveTo(int x, int y);
	public void rotate(Orientation orientation);
	public void drop();
}
