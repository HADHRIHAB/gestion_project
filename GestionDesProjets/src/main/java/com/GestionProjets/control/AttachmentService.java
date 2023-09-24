package com.GestionProjets.control;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestionProjets.entities.Attachment;

import com.GestionProjets.repositories.AttachmentRepository;


@Service
public class AttachmentService {

	@Autowired
	 AttachmentRepository attachmentRepository;
	 
	 public List<Attachment> getAllAttachments() {
		 return attachmentRepository.findAll();
	 }
	 
	 public Attachment createAttachment(Attachment attachment) {
		 return attachmentRepository.save(attachment);
	 }
	 public Optional<Attachment> getAttachmentById(long id){
		 return attachmentRepository.findById(id);
	 }
	 public void delete(long id) {
		 attachmentRepository.deleteById(id);
		}
}
