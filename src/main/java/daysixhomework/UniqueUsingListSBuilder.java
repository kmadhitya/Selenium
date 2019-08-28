package daysixhomework;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class UniqueUsingListSBuilder {
	public static void main(String[] args) {
		String compName = "Amazon India Private Limited";
		String[] split = compName.split(" ");
		String arr="";
		for (String compN : split)
		{
			arr = arr+compN;
		}
			String lowerCase = arr.toLowerCase();
			char[] chAr = lowerCase.toCharArray();
			//System.out.println(lowerCase);
			List<Character> list1 = new ArrayList<Character>();
			List<Character> list2 = new ArrayList<Character>();
			for (char lc : chAr)
			{
				list1.add(lc);
				
			}			
			for (int j=0; j<list1.size()-1; j++)
			{
				for(int k=j+1; k<=list1.size()-1; k++)
				{
					if (list1.get(j)==list1.get(k))
					{
						list2.add(list1.get(k));
						list1.remove(k);
					}
				}
			}
			//System.out.println(list1);
			//System.out.println(list2);
			list1.removeAll(list2);
			
			Set<Character> trainsSet = new LinkedHashSet<Character>();
			trainsSet.addAll(list2);
			
			StringBuilder sb1 = new StringBuilder();
			for (Character ch2 : trainsSet)
			{
				sb1.append(ch2);
			}
			String repeat = sb1.toString();
			//System.out.println(list1);
			StringBuilder sb = new StringBuilder();
			for (Character ch : list1)
			{
				sb.append(ch);
			}
			String unique = sb.toString();			
			System.out.println("Unique values are: "+unique);
			System.out.println("Repeating values are: "+repeat);
	}

}
