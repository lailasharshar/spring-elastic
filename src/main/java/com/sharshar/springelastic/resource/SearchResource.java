package com.sharshar.springelastic.resource;

import com.sharshar.springelastic.repositories.PriceData;
import com.sharshar.springelastic.repositories.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lsharshar on 4/6/2018.
 */

@RestController
@RequestMapping("/rest/search")
public class SearchResource {

	@Autowired
	PriceRepository priceRepository;

	@GetMapping(value = "/name/{text}")
	public List<PriceData> searchName(@PathVariable final String text) {
		return priceRepository.findByTicker(text);
	}

	@GetMapping(value = "/exchange/{exchange}")
	public List<PriceData> search(@PathVariable final int exchange) {
		return priceRepository.findByExchange(exchange);
	}
}
