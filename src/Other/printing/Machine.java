package Other.printing;
public class Machine implements IMachine{
	
	protected boolean isOn;

	public Machine(boolean isOn) {
		this.isOn = isOn;
	}
	
	public void turnOn() {
		isOn = true;
		System.out.println("Machine is ON!");
	}

	public void turnOff() {
		isOn = false;
		System.out.println("Machine is OFF!");
	}

	public boolean isOn() {
		return isOn;
	}

	public boolean isOff() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
