package com.betrybe.agrix.controller;

import com.betrybe.agrix.controller.dto.FertilizerDto;
import com.betrybe.agrix.entity.Fertilizer;
import com.betrybe.agrix.service.FertilizerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * FertilizerController.
 */
@RequiredArgsConstructor
@RestController()
@RequestMapping("/fertilizers")

public class FertilizerController {

  private final FertilizerService fertilizerService;

  /**
   * createNewFertilizer.
   */
  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public FertilizerDto createNewFertilizer(@RequestBody FertilizerDto fertilizer) {

    Fertilizer newFertilizer = fertilizerService.saveNewFertilizer(fertilizer.toEntity());
    return FertilizerDto.fromEntity(newFertilizer);

  }

}
