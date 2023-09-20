package com.betrybe.agrix.repository;

import com.betrybe.agrix.entity.Crops;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * CropsRepository.
 */
public interface CropsRepository extends JpaRepository<Crops, Long> {

}
