package com.example.jaz_projekt.Controllers;

import com.example.jaz_projekt.Models.currence;
import com.example.jaz_projekt.Services.NbpService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class NbpController {
    private NbpService nbpService;

    public NbpController(NbpService nbpService) {
        this.nbpService = nbpService;
    }

    public ResponseEntity<currence> getData(@RequestParam Date startDate, @RequestParam Date endDate) {
        String currenceList = nbpService.getcurrence(startDate, endDate);
        return ResponseEntity.ok(new currence(startDate, endDate));
    }
}
