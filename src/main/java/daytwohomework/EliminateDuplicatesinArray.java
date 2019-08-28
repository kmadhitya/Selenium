package daytwohomework;
public class EliminateDuplicatesinArray {
	public static void main(String[] args) {
		int[] arr={1,2,1,22,23,34,44,33,34,22,34};
		int[] dups = new int[12];
		int[] uniq = new int[12];
		for (int i=0; i<arr.length-1; i++)
		{	//System.out.println("I: "+arr[i]);
			for (int k = i+1; k < arr.length; k++) {
				//System.out.println("K: "+arr[k]);
				if(arr[i]==arr[k])
				{	//int j=0;
					System.out.println("duplicates are: "+arr[i]);
					break;
					//j++; //dups = new int[k];
				}
				else
				{System.out.println("not duplicates: "+arr[i]);}
			}	
		}/*for(int arrayElement:dups)
		{System.out.println("duplicates are: "+arrayElement);}
		/*for (int duplicates : dups) {System.out.println(duplicates);}
		for (int unique : uniq) {System.out.println(unique);}*/
	}
}