package com.GestionProjets.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;



@Entity
@Inheritance(strategy = InheritanceType.JOINED)

public class User extends SuperClass {
	

	@Column(nullable = false)
	@NotBlank(message= "Le prénom ne peut pas être vide")
	@Range(min = 2, max = 50)
	private String firstName;
	
	@Column(nullable = false)
	@NotBlank(message= "Le nom ne peut pas être vide")
	@Range(min = 2, max = 50)
	private String lastName;
	
	@Email
	@Column(unique= true)
	private String email;
	
	@Column(nullable = false)
	private String mdp;
	
	@Column
	@DateTimeFormat(pattern = "dd/MM/uuuu")
    private Date birthday;
	
	@ManyToMany
	@JoinTable(name="projet_user", joinColumns = @JoinColumn(name="user_id"), inverseJoinColumns = @JoinColumn(name="project_id"))
    private List<Project> projects = new ArrayList<>();
	
	
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
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjets(List<Project> projects) {
		this.projects = projects;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Long id, String firstName, String lastName, @Email String email, String mdp, Date birthday,
			List<Project> projets) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mdp = mdp;
		this.birthday = birthday;
		this.projects = projets;
	}
	
	

}
