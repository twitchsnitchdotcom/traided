package org.vaadin.spring.tutorial.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vaadin.spring.tutorial.service.ImporterService;

@RestController
public class TestResource {

    public TestResource(ImporterService importerService){
        this.importerService = importerService;
    }

    private final ImporterService importerService;

    private final static Logger log = LoggerFactory.getLogger(TestResource.class);

    @GetMapping("/recipient")
    public void importRecipientRecords(){
        importerService.importRecipientRecords(5);
        importerService.importEntityRecords();
    }
}
