package 과제.hw0207.장민창;

public class Contact {

	private int number;
	private String name;
	private String phoneNumber;
	
	public Contact(int number, String name, String phoneNumber) {
		this.number = number;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("No. " + this.number + "\n");
		sb.append("Name. " + this.name + "\n");
		sb.append("PhoneNumber. " + this.phoneNumber + "\n");
		return sb.toString();
	}
	
}
