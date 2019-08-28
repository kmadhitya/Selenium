package daytwohomework;

public class SumDigitsinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1546 to 16
		int sum = 0;
		String num = "1546";
		char[] chr = num.toCharArray();
		for (int i=0; i<chr.length; i++)
		{
			
			sum = sum+Integer.parseInt(String.valueOf(chr[i]));
		}
		System.out.println(sum);

	}

}
