package dayonehomework;

import java.util.ArrayList;
import java.util.List;

public class MoveAllZerosToEnd {

	public static void main(String[] args) {
		/*
		 * put it into list
		 * iterate through for each loop
		 *   check each value is equal to zero through if condition
		 *   	remove using list.remove() method
		 * 
		 * 
		 * 
		 */
		int i = 1;
		int[] data = {0,2,1,0,7,7,0,3};
		int len = data.length;
		List<Integer> list = new ArrayList<Integer>();
		
		for (int eachInt : data)
		{
			list.add(eachInt);
		}
		System.out.println(list);
		int size = list.size();
		/*for (int j=0; j<=size; j++)
		{
			
			if (list.contains())
			{
				list.remove(j);
				i++;
			}
		}
		System.out.println(i);*/

	}

}
