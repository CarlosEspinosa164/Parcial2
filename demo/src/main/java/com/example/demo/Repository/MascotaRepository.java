package com.example.demo.Repository;

import com.example.demo.Model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RMascota extends JpaRepository<Mascota, Integer> {
}
