package com.GestionProjets.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;



@Entity
@Inheritance(strategy = InheritanceType.JOINED)

public class Attachment extends SuperClass{
	 
	 @Column
	 @NotBlank(message = "Le nom du fichier ne peut pas être vide")
	 private String filename;
	 
	 
	 @Column
	 @NotNull
	 private long size;
	 
	 @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name= "project_id", nullable = true)
	    private Project project;
	 
	 @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name= "task_id", nullable = true)
	    private Task task;


	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public Attachment(long id, @NotBlank(message = "Le nom du fichier ne peut pas être vide") String filename,
			@NotNull long size, Project project, Task task) {
		super();
	
		this.filename = filename;
		this.size = size;
		this.project = project;
		this.task = task;
	}

	public Attachment() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
}
