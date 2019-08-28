package dayonehomework;

public class Primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int low = 1;
		int high = 100;
		while (low<high)
		{
			boolean flag=false;
			for (int i=2; i<=low/2; i++)
			{				
				if (low%i == 0)
				{
					flag = true;
					break;
				}
			}
			if (flag==false)
			
				System.out.println(low);
				++low;
			
		}
		/*int count = 0;
		for(int i=1; i<=high; i++)
		{
			if(high%i==0)
			{
				count++;
			}
			
		}
		if (count==2)
		{
			System.out.println(high+"is a prime number");
		}
		else
		{
			System.out.println(high+"is not a prime number");
		}*/
	}
}
