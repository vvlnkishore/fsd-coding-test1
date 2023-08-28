package com.example.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Documents;
import com.example.repo.DocumentRepository;

@Service
public class DocumentService {
	
	@Autowired
	private DocumentRepository repo;

	public void addDocument(Documents document) {
		repo.save(document);
	}
	
	public List<Documents> getDocuments() {
		return repo.findAll();
	}
	
	public void updateDocuments(Documents document) {
		Documents existingDocument = repo.findByDocumentID(document.getDocumentID());
		existingDocument.setDocument(document.getDocument());
		existingDocument.setDocumentName(document.getDocumentName());
		existingDocument.setUploadUser(document.getUploadUser());
		existingDocument.setUploadDate(new Date());
		
		repo.save(existingDocument);
	}
	
	public void deleteDocuments(Documents document) {
		repo.delete(document);
	}
	
	public void saveDocuments() {
		Documents document = new Documents(1, "document", "document", "User", new Date());
		addDocument(document);
	}
}
