package dayonehomework;
public class SumOfTwoIndices {
	public static void main(String[] args) {
		int[] arrDigits = {3,5,6,2,5,1,8,9};
		int target = 7;
		new SumOfTwoIndices().sumOfTwo1(arrDigits, target);

	}
	public void sumOfTwo1(int[] arrDigits,int target)
	{
		System.out.println("The indices are: ");
		for (int i=0; i<arrDigits.length-1; i++)
		{
			for (int j=i+1; j<arrDigits.length; j++)
			{
				if (arrDigits[i]+arrDigits[j]==target)
				{
					System.out.println(arrDigits[i]+", "+arrDigits[j]);
				}
			}
		}
	}
	
	/*for loop - 1st to last but number
	 *     for loop - current number plus 1 to last number
	 *     if loop to compare each value and see if it matches the target
	 *     print the indices
	 */
	public void sumOfTwo2(int[] arrDigits,int target)
	{
		
	}
	/* delta = target - arr number
	 * 
	 * if delta == any of the next numbers
	 * 
	 * 
	 * 
	 */
	
}
