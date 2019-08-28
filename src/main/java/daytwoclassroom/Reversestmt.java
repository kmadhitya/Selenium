package daytwoclassroom;

public class Reversestmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String txt = "Welcome to Testleaf";
		//char[] ch = txt.toCharArray();
		//char ch = txt.charAt(1);
		//System.out.println(ch);
		String[] str = txt.split(" ");
		for (int i=str.length-1; i>=0; i--) {
			System.out.print(str[i]+" ");
		}
		

	}

}
