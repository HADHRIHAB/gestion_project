package com.GestionProjets.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GestionProjets.entities.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
List<Project> findByNameContaining(String Name);
}
