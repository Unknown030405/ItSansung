package car;

public class engine {
	Wheel frontwheel = body.frontWheels;
	Wheel backwheel = body.backWheels;
	fuelBank bank = body.bank;
	public void drive() {
		if(bank.left == 0) {
			System.out.println("��� �������!!!");
			return;
		}
		if(bank.left < bank.Size/3) {
			System.out.println("�������� �� ����� �������! ���������� ��������!");
		}
		bank.drive();
		frontwheel.rotate();
		backwheel.rotate();
	}
	public void stop() {
		
	}
}
