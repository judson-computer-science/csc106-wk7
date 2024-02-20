# Week 7

## Exercise 1
- Compile the code in the `packages` directory.  Observe what errors occur and explain why based on your understanding of how packages work?
- Now extend your example by adding the following public `Cube` class to the `shape` package:
~~~~~
package shape;

public class Cube {

	protected static final String NAME = "Cube";

	private Square s1, s2, s3;

	public Cube (Square s1, Square s2, Square s3) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;

		System.out.println("Instantiated 3 " + Square.NAME + " objects");
	}

	public int getArea() {
		return 2 * s1.getArea() + 2 * s2.getArea() + 2 * s3.getArea();
	}
}
~~~~~
- Compile the code and observe the error messages again.  Do you understand what the compiler is telling you about the visibility of the `Cube.NAME` field?1
- Now compile the classes in the `shape` package only using the command `javac shape/*.java`.  What do you observe about our ability to access the protected member of the `Square` class?

## Exercise 1
Create a program that takes command line arguments, iterate through them adding them to an `ArrayList`.  Print the array list, then print every other element.
