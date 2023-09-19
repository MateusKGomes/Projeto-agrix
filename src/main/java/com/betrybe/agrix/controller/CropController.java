package com.betrybe.agrix.controller;

import com.betrybe.agrix.controller.dto.CropsDto;
import com.betrybe.agrix.entity.Crops;
import com.betrybe.agrix.service.CropService;
import com.betrybe.agrix.service.exception.CropsNotFoundException;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


/**
 * CropController.
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/crops")
public class CropController {

  private final CropService cropService;

  /**
   * findAllCrops.
   */
  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public List<CropsDto> findAllCrops() {
    List<Crops> crops = cropService.findAllCrops();

    return  crops.stream()
        .map(CropsDto::fromEntity)
        .collect(Collectors.toList());

  }

  /**
   * findCropsById.
   */
  @GetMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public CropsDto findCropsById(@PathVariable("id") Long id) throws CropsNotFoundException {
    Crops crops = cropService.findCropsById(id);

    return CropsDto.fromEntity(crops);

  }

}
