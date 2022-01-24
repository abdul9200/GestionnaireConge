package com.ensam.projets.service;

import com.ensam.projets.entity.Document;


import java.util.List;

public interface DocumentService {
    Document addDocument(Document document);
    void removeDocument(Document document);
    Document updateDocument(Document  document);
    Document getDocumentById(int id);
    List<Document> listDocument();
}

