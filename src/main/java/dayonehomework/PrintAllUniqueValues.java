package dayonehomework;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class PrintAllUniqueValues {
	public static void main(String[] args) {
		String text = "unitedstatesofamerica";
		System.out.print("Unique through Map: ");
		printUniqueValuesUsingMap(text);
		System.out.println();
		System.out.print("Unique through List: ");
		printUniqueValuesUsingList(text);
	}
	public static void printUniqueValuesUsingMap(String text)
	{
		char[] charArray = text.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (char eachChar : charArray)
		{
			if (map.containsKey(eachChar))
			{
				map.put(eachChar, map.get(eachChar)+1);
			}
			else
			{
				map.put(eachChar, 1);
			}
		}
		for (Entry<Character, Integer> eachMap : map.entrySet())
		{
			if (eachMap.getValue()==1)
			{
				System.out.print(eachMap.getKey());
			}
		}
	}
	
	public static void printUniqueValuesUsingList(String text)
	{
		char[] charArray = text.toCharArray();
		List<Character> list = new ArrayList<Character>();
		List<Character> list2 = new ArrayList<Character>();
		for (char eachChar : charArray)
		{
		list.add(eachChar);
		}
		int length = charArray.length;
		for (int i=0; i<length; i++)
		{
			for (int j=i+1; j<length; j++)
			{
				if (charArray[i]==charArray[j])
				{
					
					list2.add(charArray[i]);
				}
			}
		}
		
		list.removeAll(list2);
		for (char eachChar1 : list)
		{
		System.out.print(eachChar1);
		}
	}
	
	/*convert string to toCharArray()
	 * 1 solution - map, 2nd - iterate through 2 for loops and add to list
	 * 
	 */

}
