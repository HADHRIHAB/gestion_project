package com.GestionProjets.entities;

import java.security.Timestamp;

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

public class Comment extends SuperClass {
    
    @Column
    @NotBlank(message = "Le contenu ne peut pas être vide")
    private String content;
    
    @Column
    private Timestamp timestmp;
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "project_id", nullable = true)
    private Project project;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "task_id", nullable = true)
    private Task task;
    
    
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getTimestmp() {
		return timestmp;
	}
	public void setTimestmp(Timestamp timestmp) {
		this.timestmp = timestmp;
	}
	public Comment(int id, @NotBlank(message = "Le contenu ne peut pas être vide") String content, Timestamp timestmp) {
		super();
		
		this.content = content;
		this.timestmp = timestmp;
	}
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
