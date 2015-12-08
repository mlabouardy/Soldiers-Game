package model;

public abstract class AbstractBrick implements Brick, Cloneable {
	private int color;
	private int width;
	private int height;

	public AbstractBrick(int width, int height, int color) {
		this.width = width;
		this.height = height;
		this.color = color;
	}

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	public int getColor() {
		return color;
	}

	public String toString() {
		return "(" + width + "," + height + ") " + color;
	}

	public Brick clone() {
		Brick clone = null;

		try {
			clone = (Brick) super.clone();

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return clone;
	}

}
