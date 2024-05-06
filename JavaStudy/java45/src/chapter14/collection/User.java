package chapter14.collection;

public class User {
	
	private String id;
	private String pw;
	private String name;
	private String Reg_Date;
	
	public User() {}
	
	public User(String id, String pw, String name, String Reg_Date) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.Reg_Date = Reg_Date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReg_Date() {
		return Reg_Date;
	}

	public void setReg_Date(String reg_Date) {
		Reg_Date = reg_Date;
	}
	
	public String toString() {
		return String.format("[ID:  %s] [Name:  %s] [Reg_Date: %s]"
				, id, name, Reg_Date );
	}
}
