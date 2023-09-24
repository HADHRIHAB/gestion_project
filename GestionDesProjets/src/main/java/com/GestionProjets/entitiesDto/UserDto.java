package com.GestionProjets.entitiesDto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.GestionProjets.entities.Project;

import lombok.Data;

@Data

public class UserDto {
	
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
    private Date birthday;
    private List<Project> projects = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public UserDto(Long id, String firstName, String lastName, String email, Date birthday) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.birthday = birthday;
	}

	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setProjects(List<Project> projects2) {
		// TODO Auto-generated method stub
		
	}
    
    
}
