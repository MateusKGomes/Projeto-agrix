package com.betrybe.agrix.controller.dto;


import com.betrybe.agrix.entity.Crops;

/**
 * CropsDto.
 */
public record CropsDto(Long id, String name, Double plantedArea, Long farmId) {

  /**
   * fromEntity.
   */
  public static CropsDto fromEntity(Crops crops) {
    return new CropsDto(
        crops.getId(),
        crops.getName(),
        crops.getPlantedArea(),
        crops.getFarmId()
    );
  }

  /**
   * toEntity.
   */
  public Crops toEntity() {
    Crops crops = new Crops();
    crops.setName(name);
    crops.setPlantedArea(plantedArea);
    return crops;
  }

}
