package com.example.GPS.repository;
import com.example.GPS.entity.GpsCoordinates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface GpsCoordinatesRepository extends JpaRepository<GpsCoordinates, Long> {

    // Récupérer  les coordonnées GPS
    @Query("SELECT g FROM GpsCoordinates g WHERE g.latitude IS NOT NULL AND g.longitude IS NOT NULL")
    List<GpsCoordinates> findAllCoordinates();

   }
