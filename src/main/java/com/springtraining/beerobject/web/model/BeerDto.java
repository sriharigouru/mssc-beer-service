/**
 * 
 */
package com.springtraining.beerobject.web.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sriha
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BeerDto {
	
	private String beerName;
	private BeerStyleEnum beerStyle;
	private OffsetDateTime lastModifiedDate;
	private OffsetDateTime createdDate;
	private Integer verison;
	
	private UUID id;
	private long upc;
	
	private BigDecimal price;

}
