package com.example.restclient.services;

import com.example.restclient.json.AstroResponse;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class AstroServiceTest {

    @Autowired
    private AstroService service;

    private final Logger log = LoggerFactory.getLogger(AstroService.class);

    @Test
    public void getAstroResponse(){
        AstroResponse response = service.getAstroResponse();
        log.info(response.toString(),"***");
        assertTrue(response.number() >= 0 );
        assertEquals("success",response.message() );
        assertEquals(response.number(),response.people().size() );
    }

    @Test
    public void getAstroResponseWithRestTemplate(){
        AstroResponse response = service.getAstroResponseWithRestTemplate();
        log.info(response.toString(),"***");
        assertTrue(response.number() >= 0 );
        assertEquals("success",response.message() );
        assertEquals(response.number(),response.people().size() );
    }

}