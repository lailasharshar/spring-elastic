package com.sharshar.springelastic.repositories;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * Created by lsharshar on 4/6/2018.
 */
public interface PriceRepository extends ElasticsearchRepository<PriceData, Long> {
	public List<PriceData> findByTicker(String text);

	List<PriceData> findByExchange(int exchange);

	List<PriceData> findByUpdateTimeBetweenAndExchange(int exchange);
}
