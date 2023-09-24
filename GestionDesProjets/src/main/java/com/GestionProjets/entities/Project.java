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
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;



@Entity
@Inheritance(strategy = InheritanceType.JOINED)

public class Project extends SuperClass {
	
	@Range(min = 3, max = 100)
	@NotBlank(message = "Le nom du projet ne peut pas être vide")
	private String name;
	
	@Column(nullable = true)
	private String description;
	
	@DateTimeFormat(pattern = "dd/MM/uuuu")
	@NotNull(message= "la date est obligatoire")
	private Date startDate;
	
	@DateTimeFormat(pattern = "dd/MM/uuuu")
	@NotNull(message= "la date est obligatoire")
	private Date endDate;
	
	@ManyToMany(mappedBy = "projects")
	private List<User> users = new ArrayList<>();


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public Project(long id, @NotBlank(message = "Le nom du projet ne peut pas être vide") String name,
			String description, @NotNull(message = "la date est obligatoire") Date startDate,
			@NotNull(message = "la date est obligatoire") Date endDate, List<User> users) {
		super();
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.users = users;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
