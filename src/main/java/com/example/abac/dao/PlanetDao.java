package com.example.abac.dao;

import com.example.abac.model.Planet;
import org.springframework.stereotype.Component;

import java.util.List;

public interface PlanetDao {

    Planet insertPlanet(Planet planet);

    List<Planet> selectAllPlanets();

    boolean deletePlanet(int id);

}
