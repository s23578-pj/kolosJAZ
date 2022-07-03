package com.example.jaz_projekt.Services;

import com.example.jaz_projekt.Models.root;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@Service
public class NbpService {
    private final RestTemplate rest;

    public NbpService(RestTemplate rest) {
        this.rest = rest;
    }

    public ResponseEntity<root> getCurrencies(Date startDate, Date endDate) {
        var results = rest.getForEntity("http://api.nbp.pl/api/exchangerates/tables/A/"+ startDate + "/" + endDate + "/?format=json", root.class);
        return results;
    }

}