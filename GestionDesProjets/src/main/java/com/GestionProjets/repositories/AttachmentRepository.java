package com.GestionProjets.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GestionProjets.entities.Attachment;

public interface AttachmentRepository extends JpaRepository<Attachment, Long> {

}
