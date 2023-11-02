package home_shoping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class dto {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
private String UserName;
private String UserPassword;
private String UserEmail;
private long UserPhno;
private String UserAddress;
private String UserDate;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getUserPassword() {
	return UserPassword;
}
public void setUserPassword(String userPassword) {
	UserPassword = userPassword;
}
public long getUserPhno() {
	return UserPhno;
}
public void setUserPhno(long userPhno) {
	UserPhno = userPhno;
}
public String getUserAddress() {
	return UserAddress;
}
public void setUserAddress(String userAddress) {
	UserAddress = userAddress;
}
public String getUserDate() {
	return UserDate;
}
public void setUserDate(String userDate) {
	UserDate = userDate;
}
public String getUserEmail() {
	return UserEmail;
}
public void setUserEmail(String userEmail) {
	UserEmail = userEmail;
}

}
