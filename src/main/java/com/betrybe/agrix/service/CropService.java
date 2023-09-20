package com.betrybe.agrix.service;

import com.betrybe.agrix.entity.Crops;
import com.betrybe.agrix.repository.CropsRepository;
import com.betrybe.agrix.service.exception.CropsNotFoundException;
import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * CropService.
 */
@RequiredArgsConstructor
@Service
public class CropService {

  private final CropsRepository cropsRepository;

  public List<Crops> findAllCrops() {
    return cropsRepository.findAll();
  }

  /**
   * findCropsById.
   */
  public Crops findCropsById(Long id) throws CropsNotFoundException {
    return cropsRepository
        .findById(id)
        .orElseThrow(
            CropsNotFoundException::new
        );
  }

}
