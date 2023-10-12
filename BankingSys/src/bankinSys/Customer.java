package bankinSys;

public class Customer {
	private int id;
	private String name;
	private int contactNo;
	
	public Customer() {
		super();
		
	}
	public Customer(int id, String name, int contactNo) {
		super();
		this.id = id;
		this.name = name;
		this.contactNo = contactNo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", contactNo=" + contactNo + "]";
	}

}
