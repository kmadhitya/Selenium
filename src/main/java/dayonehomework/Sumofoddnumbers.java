package dayonehomework;

public class Sumofoddnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=0;
		
		for (int i=1; i<=100; i++)
		{
			if (i%2 != 0)
			{
				j = j+i;
			}
		}
		
			System.out.println("Odd numbers:" + j);
		

	}

}
