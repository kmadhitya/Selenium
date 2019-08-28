package dayonehomework;

public class PrimeSumAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 13;
		boolean l=false;
		for (int j=2; j<i; j++)
		{
			int k=i%j;
		
		if (k == 0)
				{
			l=true;
			break;
			
				}
		}
		if (l==false)
		{
			System.out.println(i+" is a prime number");
		}
		else
		{
			System.out.println(i+" is not a prime number");
		}
		
		// Sum of 1 to 10:
		int y=0;
		for (int x=1; x<=10; x++)
		{
			y=y+x;
			if(x==10)
			{
			System.out.println("Sum of 1 to 10 is: "+y);
		}
		}
		
		//Odd numbers between 10 to 20
		System.out.println("Odd numbers between 10 to 20 are:");
		for (int a=10; a<=20; a++)
		{
			if (a%2==1)
			{
				
				System.out.println(a);
			}
		}
		
		
		
		
		/*int age = 40;
		if (age<18)
		
		{
			System.out.println("Child");
		}
		else if(age>17 && age<60)
		{
			System.out.println("Adult");
		}
		else
		{
			System.out.println("Senior");
		}*/

	

}
	}
