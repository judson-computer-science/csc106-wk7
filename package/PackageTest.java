import shape.Box;
import shape.Square;
import shape.Cube;

public class PackageTest {

	public static void main(String[] args) {

		Box box = new Box(1,2,3);
		box.getTopSurfaceArea();

		System.out.println("Cube's name is " + Cube.NAME);

		Square square = new Square(1,2); // compile failure
		System.out.println(Square.NAME); // compile failure
	}
}

