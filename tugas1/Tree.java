//	Tugas 1. Create Treemap + Treeset dengan minimum 3 member



import java.util.TreeMap;
import java.util.TreeSet;

public class Tree {

	public static void main(String[] args) {
		// Treeset

		int numbering;
		System.out.println("TreeSet");
		TreeSet<String> ts = new TreeSet<>();
		ts.add("Lia");
		ts.add("Lia");
		ts.add("Arif");
		ts.add("Felix");
		ts.add("John");

		numbering = 1;
		for (String item : ts) {
			System.out.println(numbering + ". " + item);
			numbering++;
		}


		System.out.println("TreeSet First : " + ts.first());
		System.out.println("TreeSet Last : " + ts.last());

		System.out.println("========================");
		System.out.println("\nTreeMap");

		// TreeMap
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(26, "Lia");
		tm.put(26, "Doraemon");
		tm.put(19, "Arif");
		tm.put(8, "Felix");
		tm.put(11, "Arif");

		numbering = 1;
		for (Integer key : tm.keySet()) {
			System.out.println(numbering + ". Favorite number of " + tm.get(key) + " is " + key);
			numbering++;
		}

		System.out.println("Lowest number : " + tm.firstKey());
		System.out.println("Highest number : " + tm.lastKey());
	}
}
