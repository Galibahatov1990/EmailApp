package emailApp;

public class Email {
	
	private String firstname;
	private String lastname;
	private String department;
	private String password;
	private final int PASSWORD_LENGHT = 8;
	private static final String COMPANY_DOMAIN = "duotech.io";
	private String email;
	private String alternateEmail;
	private static final int MAILBOX_CAPACITY = 10000;
	
	
	//Constructors
	
	public Email() {
		
		this.firstname = "John";
		this.lastname = "Doe";
		this.department = "solor proper";
		this.password = "abc123456";
		this.email = "john.doe@sales.duotech.io";
		this.alternateEmail = "john.doe@gmail.com";
		
	}
	
	public Email(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		
		this.department = askDepartment();
		
		
	}
	
	
	private String askDepartment() {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Department codes:");
		System.out.println("1 - Sales");
		System.out.println("2 - Development");
		System.out.println("3 - Accounting");
		System.out.println("4 - QA");
	}
	 
	
	
	
	public String getInfo() {
		
		return "EMPLOYEE: " + + this.firstname + "" + this.lastname + "\n" +
		    "DEPARTMENT: " + this.department + "\n" + 
			 "EMAIL: " + this.email + "\n" +
		     "GENERATED PASSWORD: " + this.password;
		
		
		
		
		
	}
	
	

}
