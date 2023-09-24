package com.GestionProjets.control;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GestionProjets.entities.Comment;


@RestController
@RequestMapping

public class CommentController {
 
	@Autowired
	CommentService commentService;
	
	@GetMapping()
	 public List<Comment> getAllcomments(){
		 
		 return commentService.getAllComments();
	 }
	 @PostMapping() 
	 public ResponseEntity<Comment> saveComments(@RequestBody Comment comment) {
		  commentService.createComment(comment);
	     return (ResponseEntity.ok(comment));
	 }
	 
	 @GetMapping("/{id}")
	 public Optional<Comment> getCommentById(@PathVariable long id) {
	     Optional<Comment> comment  = commentService.getCommentById(id);
	     if (comment.isPresent()) {
	         return Optional.empty();
	     } else {
	         return Optional.empty();
	     }
	 }
	 @DeleteMapping("/{id}")
	 public ResponseEntity<Void>  deleteComment(@PathVariable long id) {
	 	commentService.delete(id);
	 	return ResponseEntity.noContent().build();
	 }
}
