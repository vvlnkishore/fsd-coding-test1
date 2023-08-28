package com.example.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.model.Documents;

public interface DocumentRepository extends MongoRepository<Documents, Integer> {

	public Documents findByDocumentID(int documentID);
}
