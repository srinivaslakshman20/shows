package com.xyz.shows.management.controller;

import com.xyz.shows.management.ShowsApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShowsApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CinemaControllerIT {

    @LocalServerPort
    private int port;
    HttpHeaders headers = new HttpHeaders();
    TestRestTemplate restTemplate = new TestRestTemplate();

    @Test
    public void getAllCinemas(){
        HttpEntity<String> entity = new HttpEntity(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(
                createURL("/cinemas/1"),
                HttpMethod.GET, entity, String.class);
        Assert.assertEquals("Response is not equal"
                ,"{\"code\":\"Not_Found\",\"description\":\"Cinema with Id:1 not found in inventory\"}"
                ,response.getBody());
    }

    private String createURL(String uri) {
        return "http://localhost:" + port + uri;
    }

}
