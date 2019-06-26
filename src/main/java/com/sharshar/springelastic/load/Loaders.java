package com.sharshar.springelastic.load;

import com.sharshar.springelastic.repositories.PriceData;
import com.sharshar.springelastic.repositories.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

/**
 * Created by lsharshar on 4/6/2018.
 */
@Component
public class Loaders {

	@Autowired
	private PriceRepository priceRepository;

	@Autowired
	private ElasticsearchOperations operations;

	@PostConstruct
	@Transactional
	public void loadAll() {
		operations.putMapping(PriceData.class);
		System.out.println("Loading Data");
	}
}
