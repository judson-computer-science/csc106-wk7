public class Box implements Measureable {

	private int l, w, h;

	public Box(int l, int w, int h) {
		this.l = l;
		this.w = w;
		this.h = h;
	}

	public int getTotalEdgeLength() {
		return 4 * (l + w + h);
	}

	public int getTotalSurfaceArea() {
		return 2 * ((l * w) + (l * h) + (w * h));
	}
}
