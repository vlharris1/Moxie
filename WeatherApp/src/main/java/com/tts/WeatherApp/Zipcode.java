package com.tts.WeatherApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Zipcode {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		
		private Long id;
		private String zips;
		
		public Zipcode (String zips) {
			this.zips = zips;
			
		}	
}
