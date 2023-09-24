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

import com.GestionProjets.entities.Attachment;
import com.GestionProjets.entities.Comment;

@RequestMapping
@RestController

public class AttachmentController {
	@Autowired
	AttachmentService attachmentService;
	
	@GetMapping()
	 public List<Attachment> getAllAttachments(){
		 
		 return attachmentService.getAllAttachments();
	 }
	 @PostMapping() 
	 public ResponseEntity<Attachment> saveComments(@RequestBody Attachment attachment) {
		  attachmentService.createAttachment(attachment);
	     return (ResponseEntity.ok(attachment));
	 }
	 
	 @GetMapping("/{id}")
	 public Optional<Comment> getAttachmentById(@PathVariable long id) {
	     Optional<Attachment> attachment  = attachmentService.getAttachmentById(id);
	     if (attachment.isPresent()) {
	         return Optional.empty();
	     } else {
	         return Optional.empty();
	     }
	 }
	 @DeleteMapping("/{id}")
	 public ResponseEntity<Void>  deleteAttachment(@PathVariable long id) {
	 	attachmentService.delete(id);
	 	return ResponseEntity.noContent().build();
	 }
}
