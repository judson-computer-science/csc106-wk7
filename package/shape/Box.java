package shape;

public class Box {

	private int l, w, h;

	public Box(int l, int w, int h) {
		this.l = l;
		this.w = w;
		this.h = h;
	}

	public int getLength() { return l; }
	public int getWidth() { return w; }
	public int getHeight() { return h; }

	public int getTopSurfaceArea() {
		System.out.println("creating new " + Square.NAME);
		Square s = new Square(l, w);
		return s.getArea();
	}
}

class Square {

	 protected static final String NAME = "Square";
        private int l, w;

        public Square(int l, int w) {
                this.l = l;
                this.w = w;
        }

        public int getArea() { return l * w; }
}

