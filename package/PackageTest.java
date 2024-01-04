import shape.Box;

public class PackageTest {

	public static void main(String[] args) {

		Box box = new Box(1,2,3);
		box.getTopSurfaceArea();

		Square square = new Square(1,2); // compile failure
		System.out.println(Square.NAME); // compile failure
	}
}

