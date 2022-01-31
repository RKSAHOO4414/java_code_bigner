import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetTreeSetEx 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> set1=new HashSet<Integer>();
		TreeSet<Integer> set2=new TreeSet<Integer>();
		int arr[] = {11,22,33,44,55,66,77,88,99,11,22,11,1,2,3,3,3,12,3,5};
		for (int a : arr) 
		{
			set1.add(a);
			set2.add(a); 	//slower
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set1.size());
		set1.remove(11);
		System.out.println(set1);
		System.out.println(set1.contains(11));
	}
}
