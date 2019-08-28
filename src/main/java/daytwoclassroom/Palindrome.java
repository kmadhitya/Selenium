package daytwoclassroom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt = "level";
		String txt1 ="";
		
		char[] ch = txt.toCharArray();
		
		for(int i=ch.length-1; i>=0; i--)
		{
			txt1 = txt1+ch[i];
		}
		System.out.print("Using Char Array: \n");
		
			System.out.print(txt1+"\n");
			
			if(txt.equalsIgnoreCase(txt1))
					{
				System.out.println("It is a palindrome");
					}
			else
			{
				System.out.println("Not a palindrome");
			}
			
			System.out.print("Using List: ");
			List<Character> list1 = new ArrayList<Character>();
			List<Character> list2 = new ArrayList<Character>();
			for (char eachChar : ch)
			{
				list1.add(eachChar);
			}
			System.out.println(list1);
			int size = list1.size();
			for (int i = size-1; i>=0; i--)
			{
				list2.add(list1.get(i));
			}
			System.out.println(list2);
			StringBuilder sb = new StringBuilder();
			for (char eachCh : list2)
			{
				sb.append(eachCh);
			}
			String string = sb.toString();
			System.out.println(string);
			if (string.equalsIgnoreCase(txt))
			{
				System.out.println(txt+" is a palindrome");
			}
			else
			{
				System.out.println(txt+" is not a palindrome");
			}
			System.out.print("Using String Builder: ");
			StringBuilder sb1 = new StringBuilder();
			for (char eachChr : ch)
			{
				sb1.append(eachChr);
			}
			StringBuilder reverse = sb1.reverse();
			System.out.println(reverse);
			String string2 = reverse.toString();
			if (string2.equals(txt))
			{
				System.out.println(txt+" is a palindrome");
			}
			else
			{
				System.out.println(txt+" is not a palindrome");
			}

	}

}
