package com.tts.techtalentstore.model;

import java.util.Collection;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User implements UserDetails {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tag_id")
    private Long id;
	
	private String username;
	
	private String password;
	
	@ElementCollection
	private Map<Product, Integer> cart;
	
	@Transient
	private boolean accountNonExpired = true;
	  @Transient
	  private boolean accountNonLocked = true;
	  @Transient
	  private boolean credentialsNonExpired = true;
	  @Transient
	  private boolean enabled = true;
	  @Transient
	  private Collection<GrantedAuthority> authorities = null;
	  	  

}
