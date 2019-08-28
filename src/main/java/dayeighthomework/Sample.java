package dayeighthomework;

public class Sample{
	
	static int i = 0;

	public static void main(String args) {
		// TODO Auto-generated method stub
		int i=5,j=2;
		System.out.println(i%j);
		Sample obj = new Sample();
		obj.print();

	}
	
	public void print()
	{
		final int j = 0;
		System.out.println(this.i);
	}

}
