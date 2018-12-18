import java.util.*;

public class convert_map_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> m = new HashMap<String, String>();
		m.put("Hello", "World");
		m.put("Apple", "3.14");
		m.put("Another", "Element");
		List<String> list = new ArrayList<String>(m.keySet());
		list.forEach(System.out::println);
		//list.forEach(x -> System.out.println(x));
		List<String> list1 = new ArrayList<String>(m.values());
		list1.forEach(System.out::println);

	}

}
