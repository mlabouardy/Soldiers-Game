package model;

public interface Brick extends Cloneable{
	
	int getWidth();
	int getHeight();
	int getColor();
	String toString();
	Brick clone();
	
}
