package com.traidable.app.service;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ObjectMapperService {

    private final static Logger log = LoggerFactory.getLogger(ObjectMapperService.class);

    private static ObjectMapper objectMapper;


    public static ObjectMapper getObjectMapper(){
        if(objectMapper == null){
            JavaTimeModule module = new JavaTimeModule();
            objectMapper = new ObjectMapper()
                    .setSerializationInclusion(JsonInclude.Include.NON_NULL)
                    .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                    .registerModule(module);
        }
        return objectMapper;
    }
}
