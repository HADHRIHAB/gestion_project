package com.GestionProjets.control;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestionProjets.entities.Comment;

import com.GestionProjets.repositories.CommentRepository;


@Service
public class CommentService {

	@Autowired
	 CommentRepository commentRepository;
	 
	 public List<Comment> getAllComments() {
		 return commentRepository.findAll();
	 }
	 
	 public Comment createComment(Comment comment) {
		 return commentRepository.save(comment);
	 }
	 public Optional<Comment> getCommentById(long id){
		 return commentRepository.findById(id);
	 }
	 public void delete(long id) {
			commentRepository.deleteById(id);
		}
}
