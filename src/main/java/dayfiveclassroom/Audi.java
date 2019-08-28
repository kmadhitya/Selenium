package dayfiveclassroom;

public class Audi extends Car implements LearnInterface, LearnInterface1{
	
	public void audiLogo()
	{
		System.out.println("Audi has a Logo");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Audi audiObj = new Audi();
		//audiObj.changeGear();
		audiObj.soundHorn();
		audiObj.airCond();
		int seatNo = audiObj.seat();
		System.out.println(seatNo);
		audiObj.audiLogo();
		audiObj.interfaceMethod();
		
		Car carObj = new Car();
		carObj.changeGear();
		

	}

	public void interfaceMethod() {
		System.out.println("Audi Interface Implementation");
		
	}

	public void interfaceImplementaion1() {
		System.out.println("Audi Interface Implementation1");
		
	}

}
