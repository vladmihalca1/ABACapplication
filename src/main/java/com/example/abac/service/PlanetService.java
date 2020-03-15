package com.example.abac.service;

import com.example.abac.dao.PlanetDao;
import com.example.abac.model.Planet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanetService {

    private PlanetDao planetDao;

    @Autowired
    public PlanetService(PlanetDao planetDao) {
        this.planetDao = planetDao;
    }

    public Planet addPlanet(Planet planet) {
        Planet responsePlanet = planetDao.insertPlanet(planet);
        if(responsePlanet == null){
            System.err.print("Insert error");
            return null;
        }
        return responsePlanet ;
    }


    public List<Planet> getAllPlanet() {
        return planetDao.selectAllPlanets();
    }
}
