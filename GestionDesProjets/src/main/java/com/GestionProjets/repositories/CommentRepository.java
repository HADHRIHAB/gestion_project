package com.GestionProjets.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GestionProjets.entities.Comment;
import com.GestionProjets.entities.Project;

public interface CommentRepository extends JpaRepository<Comment, Long>{
 List<Comment> findByProject(Project project);
}
