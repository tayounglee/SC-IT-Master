package chapter13.collection;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class User implements Comparable<User>{

	private String id;
	private String pw;
	private String name;
	private String Reg_Date;
	
	public User(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		GregorianCalendar today = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/M/d a hh:mm:ss");
		String result = sdf.format(today.getTime());
		this.Reg_Date = result;
	}

	@Override
	public int hashCode() {
		return this.id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (this.id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("[ID: %5s] [Name: %4s] [Reg_Date: %s]", id, name, Reg_Date);
	}
	
	@Override
	public int compareTo(User m) {
		return (this.id.compareTo(m.id));	// 역순 * -1
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getReg_Date() {
		return Reg_Date;
	}
	
	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
}
