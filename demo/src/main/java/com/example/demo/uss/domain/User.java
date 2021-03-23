package com.example.demo.uss.domain;

import lombok.AllArgsConstructor;
<<<<<<< HEAD
import lombok.Builder;
import lombok.Data;
=======
import lombok.Data;
import lombok.NoArgsConstructor;
>>>>>>> 58233155e5cea5725b30941c9f03c8ec6e689b44

import javax.persistence.*;


@Data
@Entity
@AllArgsConstructor
<<<<<<< HEAD
=======
@NoArgsConstructor
>>>>>>> 58233155e5cea5725b30941c9f03c8ec6e689b44
@Table(name="User")
public class User  {
	
	@Id
<<<<<<< HEAD
	@GeneratedValue
=======
	@GeneratedValue(strategy = GenerationType.AUTO)
>>>>>>> 58233155e5cea5725b30941c9f03c8ec6e689b44
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

<<<<<<< HEAD
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
=======
	}
>>>>>>> 58233155e5cea5725b30941c9f03c8ec6e689b44
