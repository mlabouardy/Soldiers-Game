package builder;

import model.Orientation;

public class CountLegoBuild implements LegoBuilder{
	private int tab[]=new int[5];
	
	@Override
	public void get1x1() {
		tab[0]++;
	}

	@Override
	public void get1x2() {
		tab[1]++;
	}

	@Override
	public void get2x2() {
		tab[2]++;
	}

	@Override
	public void get1x4() {
		tab[3]++;
	}

	@Override
	public void get2x4() {
		tab[4]++;
	}

	public int[] getResults(){
		return tab;
	}
	
	@Override
	public void moveTo(int x, int y) {
		
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
