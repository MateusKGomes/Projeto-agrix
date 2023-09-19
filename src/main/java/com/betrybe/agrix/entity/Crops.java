package com.betrybe.agrix.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * Crops.
 */
@Data
@Entity
@Table(name = "crop")
@AllArgsConstructor
@NoArgsConstructor
public class Crops {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;

  @JoinColumn(name = "planted_area")
  private Double plantedArea;

  @JoinColumn(name = "planted_date")
  private LocalDate plantedDate;

  @JoinColumn(name = "harvest_date")
  private LocalDate harvestDate;

  @Column(name = "farm_id", updatable = false, insertable = false)
  private Long farmId;

  @ManyToOne
  @JoinColumn(name = "farm_id")
  private Farm farm;

}
