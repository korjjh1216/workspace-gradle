package com.example.demo.uss.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@AllArgsConstructor
@Table(name="User")
public class User  {
	
	@Id
	@GeneratedValue
	@Column(name="user_no")
	private long userNo;
	
	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;
	
		
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "birthday")
	private String birthday;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "regdate")
	private String regdate;

	@Builder
	public User(String name, String password, String username, String email, String birthday, String gender,
			String regdate) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
		this.birthday = birthday;
		this.gender = gender;
		this.regdate = regdate;
		return;
	}
	public User() {return;}
	

}
