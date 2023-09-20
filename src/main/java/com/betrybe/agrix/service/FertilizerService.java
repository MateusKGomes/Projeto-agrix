package com.betrybe.agrix.service;

import com.betrybe.agrix.entity.Fertilizer;
import com.betrybe.agrix.repository.FertilizerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * FertilizerService.
 */
@RequiredArgsConstructor
@Service
public class FertilizerService {

  private final FertilizerRepository fertilizerRepository;

  /**
   * saveNewFertilizer.
   */
  public Fertilizer saveNewFertilizer(Fertilizer fertilizer) {
    return fertilizerRepository.save(fertilizer);
  }

}
