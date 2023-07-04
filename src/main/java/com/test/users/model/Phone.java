package com.test.users.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "phones")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Phone {
	
	@Id
    @GeneratedValue	
	private long id;
	
	
	
	 @Column(name = "number")
	private String number ;
	 @Column(name = "citycode")
	private String citycode;
	 @Column(name = "countrycode")
	private String countrycode;

}
