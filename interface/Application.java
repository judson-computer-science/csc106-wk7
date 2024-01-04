import java.util.ArrayList;

public class Application {

        public static void main(String[] args) {
                ArrayList<Measureable> shapes = new ArrayList<>();
                shapes.add(new Box(2,3,4));
                shapes.add(new Square(5,6));

                for(int i=0; i<shapes.size(); i++) {
                        System.out.println(shapes.get(i).getTotalEdgeLength());
                        System.out.println(shapes.get(i).getTotalSurfaceArea());
                }
	}
}
