package com.example.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("documents")
public class Documents {

	@Id
	private int documentID;
	private String documentName;
	private String document;
	private String uploadUser;
	private Date uploadDate;

	public Documents() {

	}

	public Documents(int documentID, String documentName, String document, String uploadUser, Date uploadDate) {
		this.documentID = documentID;
		this.documentName = documentName;
		this.document = document;
		this.uploadUser = uploadUser;
		this.uploadDate = uploadDate;
	}

	public int getDocumentID() {
		return documentID;
	}

	public void setDocumentID(int documentID) {
		this.documentID = documentID;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getUploadUser() {
		return uploadUser;
	}

	public void setUploadUser(String uploadUser) {
		this.uploadUser = uploadUser;
	}

	public Date getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	@Override
	public String toString() {
		return "Documents [documentID=" + documentID + ", documentName=" + documentName + ", document=" + document
				+ ", uploadUser=" + uploadUser + ", uploadDate=" + uploadDate + "]";
	}
}
