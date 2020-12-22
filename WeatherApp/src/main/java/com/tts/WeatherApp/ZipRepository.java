package com.tts.WeatherApp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZipRepository extends CrudRepository<Zipcode, Long> {

	void save(Request request);
			
}
