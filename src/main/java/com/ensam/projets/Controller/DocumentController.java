package com.ensam.projets.Controller;
import org.springframework.web.bind.annotation.*;
import com.ensam.projets.entity.Document;
import com.ensam.projets.service.DocumentService;

import java.util.List;

@RestController
@RequestMapping(path = "/document")
public class DocumentController {
    private DocumentService documentService;

    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @PostMapping(path = "/add")
    public Document addDocument(@RequestBody Document document){
        return documentService.addDocument(document);
    }
    @PutMapping(path = "/update")
    public Document updateDocument(@RequestBody Document document){
        return documentService.updateDocument(document);
    }
    @DeleteMapping(path = "/remove/{id}")
    public void removeDocument(@PathVariable(name="id")int id){
        documentService.removeDocument(documentService.getDocumentById(id));
    }
    @GetMapping(path="/listDocument")
    public List<Document> listDocument(){
        return documentService.listDocument();
    }
}
