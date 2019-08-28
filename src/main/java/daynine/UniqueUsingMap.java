package daynine;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class UniqueUsingMap {
	public static void main(String[] args) {
		String compName = "PayPal Indiaa";
		String[] split = compName.split(" ");
		String arr="";
		for (String compN : split)
		{
			arr = arr+compN;
		}
			System.out.println(arr);
			String lowerCase = arr.toLowerCase();
			char[] chAr = lowerCase.toCharArray();
			System.out.println(chAr);
			int j=0;
			Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
			for (Character eachChar : chAr)
			{
				if (map.containsKey(eachChar))
				{
					j = map.get(eachChar)+1;
					map.put(eachChar, j);
				}
				else
				{
					map.put(eachChar, 1);
				}
			}
			List<Character> list1 = new ArrayList<Character>();
			List<Character> list2 = new ArrayList<Character>();
			System.out.println(map);
			for (Map.Entry<Character, Integer> eachMap : map.entrySet())
			{
				if (eachMap.getValue() > 1)
				{
					list1.add(eachMap.getKey());
				}
				else
				{
					list2.add(eachMap.getKey());
				}
			}
			
			//String Builder
			
			System.out.println("Duplicate values are: "+list1);
			System.out.println("Unique values are: "+list2);
			
	}
		
}