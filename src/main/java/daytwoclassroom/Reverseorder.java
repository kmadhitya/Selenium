package daytwoclassroom;



public class Reverseorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt = "TestLeaf";
		
		char[] ch = txt.toCharArray();
		
		/*for(int i=0; i<ch.length; i++)
			System.out.print(ch[i]);*/
		
		for(int i=ch.length-1; i>=0; i--)
			System.out.print(ch[i]);

	}

}
