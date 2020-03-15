package com.example.abac.dao;

import com.example.abac.model.Planet;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.util.List;

@Component
public class PlanetDaoImpl implements PlanetDao {

    @Override
    public List<Planet> selectAllPlanets() {
        return null;
    }

    @Override
    public boolean deletePlanet(int id) {
        return false;
    }

    public Planet insertPlanet(Planet planet) {
        try {
            String sql = "INSERT INTO planet (Name, Status, Description, Robots) values (?, ?, ?, ?)";
            PreparedStatement statement = DatabaseConnection.getInstance().getConnection().prepareStatement(sql);
            statement.setString(1, planet.getName());
            statement.setString(2, planet.getStatus());
            statement.setString(3, planet.getDescription());
            statement.setInt(4, planet.getRobots());
            statement.execute();
            System.out.println("Insertion complete");
            System.out.println(planet.getName());
        } catch (Exception e) {
            System.err.print("Exception " + e.getLocalizedMessage());
            return null;
        }
        return planet;
    }

}
