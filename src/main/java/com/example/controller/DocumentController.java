package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Documents;
import com.example.service.DocumentService;

@RestController
@RequestMapping("/documents")
public class DocumentController {

	@Autowired
	private DocumentService service;

	@PostMapping
	public void addDocument(@RequestBody Documents document) {
		service.addDocument(document);
	}

	@GetMapping
	public List<Documents> getDocuments() {
		return service.getDocuments();
	}

	@PutMapping
	public void updateDocument(Documents document) {
		service.updateDocuments(document);
	}

	@DeleteMapping
	public void deleteDocument(Documents document) {
		service.deleteDocuments(document);
	}
}
