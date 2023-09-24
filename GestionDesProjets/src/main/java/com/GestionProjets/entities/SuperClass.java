package com.GestionProjets.entities;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@MappedSuperclass
public class SuperClass {
 
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)	
	private long id;
    
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    
    private Date createdAt;
    @Temporal(TemporalType.TIMESTAMP)

    @LastModifiedDate
    private Date updatedAt;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public SuperClass(long id) {
		super();
		this.id = id;
	}

	public SuperClass() {
		super();
		// TODO Auto-generated constructor stub
	}
    
 
}
