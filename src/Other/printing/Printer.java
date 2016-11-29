package Other.printing;

public class Printer implements IMachine{

	private String modelNumber;
	private String textToPrint;
	private boolean isOn;
	private Machine machine;
	private paperTray tray1= new paperTray();
	
// Constructor to give printer its Initial stuff
	public Printer (boolean  isOn, String modelNumber) {
		machine = new Machine(isOn);
		this.modelNumber = modelNumber;
	
	} 
// Method to turn off the printer , declared in IMachine Interface
	public void turnOn(){
		System.out.println("Printer is warming up!");
//		isOn = true;
//		System.out.println("Printer is ON!");
		machine.turnOn();  // Delegation.
	}
	
// Method to turn off the printer, declared in IMachine Interface
	public void turnOff() {
//		isOn = false;
//		System.out.println("Printer is OFF!"); 
		machine.turnOff();
	}
// isOn Method 
	public boolean isOn() {
		return machine.isOn();
	}
	
// isOff Method
	public boolean isOff() {
		return machine.isOff();
	}


	
// Method for Getting Content to Print
	public void printThis(String textToPrint) {
		this.textToPrint = textToPrint;
	}
	
//	Method for Loading Paper
	public void loadPaper(int count) {
		tray1.addPaper(count);
	}

	
//  Method for Printing Copies
	public void print (int copies) {
		int jobCount = 1;
		String onStatus = "";
		
		if(machine.isOn())
			onStatus = "is ON !";
		else 
			onStatus = "is OFF !";
		
		String printerStat = "---Info : "+modelNumber +" "+ onStatus +"---";
		
		while(copies > 0 && !tray1.isEmpty() ) {
			
			System.out.println(printerStat);
			System.out.println(textToPrint);
			
			copies --;
			tray1.usePaper();
		}
			
		if (tray1.isEmpty()) {
			System.out.println("---Error : Job "+jobCount+" No Paper in Tray 1---");
		}
		
		System.out.println("---Info : Job "+jobCount+" complete ---");
		jobCount++;
	}
	
}
