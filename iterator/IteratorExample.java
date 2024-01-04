import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {


	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("one");
		list.add("two");
		list.add("three");

		Iterator iterator = list.iterator();

		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}


		for(String str : list) {
			System.out.println(str);
		}
	}
}
