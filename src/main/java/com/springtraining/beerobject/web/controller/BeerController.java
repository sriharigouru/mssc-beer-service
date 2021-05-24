package com.springtraining.beerobject.web.controller;

import java.util.UUID;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.springtraining.beerobject.web.model.BeerDto;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

	@GetMapping("/{beerId}")
	public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID id) {
		return new ResponseEntity<>(BeerDto.builder().id(id).build(), HttpStatus.OK);

	}

	@PostMapping
	public ResponseEntity createNewBeer(@RequestBody BeerDto beerDto) {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("Location", "http://localhost:8080/api/v1/bee/" + beerDto.getId());
		return new ResponseEntity(httpHeaders, HttpStatus.CREATED);
	}

	@PutMapping("/{beerId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void updateBeer(@PathVariable("beerId") UUID id, @RequestBody BeerDto beerDto) {
		
		
	}
}
