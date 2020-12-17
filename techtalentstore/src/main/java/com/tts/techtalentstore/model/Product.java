package com.tts.techtalentstore.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
	
	 @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     @Column(name = "tag_id")
     private Long id;
	 private int quantity;
	 private int price;
	 private String description;
	 private String name;
	 private String brand;
	 private String category;
	 private String image;

}