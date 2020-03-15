package com.example.abac.api;

import com.example.abac.model.Planet;
import com.example.abac.service.PlanetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/planet")
@RestController
public class PlanetController {
    private final PlanetService planetService;

    @Autowired
    public PlanetController(PlanetService planetService) {
        this.planetService = planetService;
    }

    @PostMapping
    public ResponseEntity<Planet> addPlanet(@RequestBody Planet planet){
        Planet response = planetService.addPlanet(planet);
        if(response == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public List<Planet> getAllPlanets(){
        return planetService.getAllPlanet();
    }

    @DeleteMapping
    public boolean deletePlanet(int id){

     return true;
    }
}
