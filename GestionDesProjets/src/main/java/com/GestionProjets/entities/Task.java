package com.GestionProjets.entities;

import java.util.Date;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;

import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;



@Entity
@Inheritance(strategy = InheritanceType.JOINED)

public class Task extends SuperClass {
    
    @Column(nullable = false)
    @NotBlank(message="")
    @Range(min = 3, max = 100)
    private String title;
    
    @Column
    private String description;
    
    @Column(nullable = false)
    @DateTimeFormat(pattern = "dd/MM/uuuu")
    private Date deadline;
   
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "project_id", nullable = true)
    private Project project;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "user_id", nullable = true)
    private User user;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Task(long id, @NotBlank(message = "") String title, String description, Date deadline, Project project,
			User user) {
		super();
	
		this.title = title;
		this.description = description;
		this.deadline = deadline;
		this.project = project;
		this.user = user;
	}

	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
    
    
    
}
