package test;

import builder.CountLegoBuild;
import builder.LegoBuilder;
import builder.OrientableLegoBuild;
import factory.LegoFactory;
import factory.ParamFactory;
import model.Brick;
import model.Brick1x1;
import model.Brick1x2;
import model.Brick1x4;
import model.Brick2x2;
import model.Brick2x4;
import model.Orientation;

public class Main {
	public static void main(String[] args) {
		int red=0x0000FF;
		int yellow=0xFFFF00;
		Brick b1=new Brick1x1(red);
		Brick b2=new Brick2x2(red);
		Brick b3=new Brick1x2(yellow);
		Brick b4=new Brick1x4(yellow);
		Brick b5=new Brick2x4(red);
		LegoFactory lf=new ParamFactory(b1, b2, b3, b4, b5);
		OrientableLegoBuild builder=new OrientableLegoBuild(lf);
		builder.get2x4();
		builder.drop();
		builder.get1x2();
		builder.rotate(Orientation.SOUTH);
		builder.drop();
		builder.get1x4();
		builder.drop();
		builder.get1x1();
		builder.moveTo(0, 4);
		builder.drop();
		builder.get2x2();
		builder.moveTo(0, 2);
		builder.drop();
	}
}
