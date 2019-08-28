package daysixclassroom;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExerciseFourMap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String com = "Cognizant";
		char[] chArray = com.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (char c : chArray)
		{
			if(map.containsKey(c))
			{
				Integer integer = map.get(c)+1;
				map.put(c,integer);
			}
			else
			{
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}

}