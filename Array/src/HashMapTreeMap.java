import java.util.HashMap;
import java.util.TreeMap;

public class HashMapTreeMap 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> map1= new HashMap<Integer, String>();
		TreeMap<Integer, String> map2= new TreeMap<Integer, String>();
		System.out.println(map1);
		map1.put(1, "Raja");
		map1.put(100, "y");
		map1.put(4, "c");
		map1.put(100, "D");
		System.out.println(map1);
		System.out.println(map2);
		map2.put(100, "Raja");
		map2.put(1, "y");
		map2.put(40, "c");
		map2.put(30, "D");
		System.out.println(map2);
		
		System.out.println(map2.size());
		System.out.println(map2.containsKey(100));
		System.out.println(map2.containsValue("Raja"));
		System.out.println(map2.keySet());
		System.out.println(map2.values());
		System.out.println(map2.firstEntry());
		System.out.println(map2.lastEntry());
		System.out.println(map2.entrySet());
		System.out.println(map2.isEmpty());
	}
}
