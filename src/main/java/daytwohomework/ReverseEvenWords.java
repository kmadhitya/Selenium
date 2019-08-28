package daytwohomework;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//I am a software Tester
		String txt = "I am a software Tester";
		//char[] ch = txt.toCharArray();
		//char ch = txt.charAt(1);
		//System.out.println(ch);
		String[] ch1 = txt.split(" ");
		for (int i=ch1.length-1; i>=0; i--) {
			System.out.print(ch1[i]+" ");
		}

	}

}
