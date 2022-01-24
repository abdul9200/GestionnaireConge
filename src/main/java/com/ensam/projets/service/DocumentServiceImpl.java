package com.ensam.projets.service;

import com.ensam.projets.entity.Document;
import com.ensam.projets.repository.DocumentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DocumentServiceImpl implements DocumentService{
    private DocumentRepository rep;

    public DocumentServiceImpl(DocumentRepository r) {
        rep = r;
    }
    @Override
    public Document addDocument(Document document) {
        return rep.save(document);
    }

    @Override
    public void removeDocument(Document document) {
        rep.delete(document);
    }

    @Override
    public Document updateDocument(Document document) {
        return rep.save(document);
    }

    @Override
    public Document getDocumentById(int id) {
        return rep.findById(id).get();
    }

    @Override
    public List<Document> listDocument() {
        return rep.findAll();
    }
}
