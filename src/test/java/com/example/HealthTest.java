package com.example;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
public class HealthTest {

    @Inject
            @Client("/")
    HttpClient client;


    @Test
    public void testHealthRespondsOK() {
        Map map = client.toBlocking().retrieve(HttpRequest.GET("/health"), Map.class);

        assertNotNull(map);
        assertTrue(map.containsKey("status"));
        assertEquals(map.get("status"), "UP");
    }

}
