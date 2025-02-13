package 과제.hw0207.장민창;

public class ExtendContact extends Contact {

	private String birthdate;
	private String company;
	private String position;
	private String address;
	
	public ExtendContact(int number, String name, String phoneNumber
			, String birthdate, String company, String position, String address) {
		super(number, name, phoneNumber);
		this.birthdate = birthdate;
		this.company = company;
		this.position = position;
		this.address = address;
	}
	
	@Override
	public String toString() {
		String contactString = super.toString();
		StringBuffer sb = new StringBuffer();
		sb.append(contactString);
		sb.append("Birthdate. " + this.birthdate + "\n");
		sb.append("Company. " + this.company + "\n");
		sb.append("Position. " + this.position + "\n");
		sb.append("Address. " + this.address + "\n");
		return sb.toString();
	}
	
}


