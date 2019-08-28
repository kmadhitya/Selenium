package daysixhomework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCompanyInReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] comp = {"HCL", "CTS", "Aspire Systems", "Wipro", "TCS", "Grab", "Ola", "Salesforce"};
		
		List<String> companies = new ArrayList<String>();
		
		for (String c :  comp)
		{
			companies.add(c);
		}
		//System.out.println(companies);
		Collections.sort(companies);
		System.out.println("Companies after sorting: "+companies);
		Collections.reverse(companies);
		System.out.println("Companies in reverse Order: "+companies);

	}

}
