package com.domain;
@Entity
@Table(name = "users")
public class User {
	@id
	@GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String userName;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
    
}
