package dayonemymobile;

public class Myphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile obj = new Mobile();
		obj.sendSMS();
		obj.dialNumber();
		String mobilebrand = obj.brand;
		String mobilemodel = obj.model;
		
		System.out.println(mobilebrand+" "+mobilemodel);
	
		

	}

}
