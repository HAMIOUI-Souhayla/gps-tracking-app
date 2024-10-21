package com.example.GPS.controller;

import com.example.GPS.entity.GpsCoordinates;
import com.example.GPS.repository.GpsCoordinatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gps")
@CrossOrigin(origins = "*")
public class GPSController {

    @Autowired
    private GpsCoordinatesRepository gpsCoordinatesRepository;

    // Récupérer les coordonnées GPS
    @GetMapping
    public List<GpsCoordinates> getAllCoordinates() {
        return gpsCoordinatesRepository.findAllCoordinates();
    }

}
