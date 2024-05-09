package chapter11.object;

public class User {
	int userId;
	String userName;
	
	public User(int userId, String userName) {
		this.userId = userId;
		this.userName = userName;
	}

	@Override
	public String toString() {
		return userId + "," + userName;
	}
/*
	동일성(Identity) 
		== 사용해서 객체 인스턴스의 주소 값을 비교한다.
		분명 주소는 두개므로 다르다 
	동등성(Equality) 
		비교는 equals() 메소드를 사용해서 객체 내부의 값을 비교한다.
		논리적 값이 같으므로 같다
 */
	@Override
	public int hashCode() {
		return userId;
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
		if (userId != other.userId)
			return false;
		return true;
	}
	
}
