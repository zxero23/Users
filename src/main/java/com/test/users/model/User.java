package com.test.users.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.springframework.beans.factory.annotation.Value;

import com.fasterxml.jackson.annotation.JsonFormat;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	
   

	@Id
    @GeneratedValue	
	private long id;
	
	
	
	 @Column(name = "name")
    private String name;
	 
	
	@Column(unique = true)
	@Email(message = "Correo electrónico no valido", regexp = "[a-zA-Z]+@[a-zA-Z]+\\.cl")
	@NotEmpty(message = "Email cannot be empty")	
    private String email;
	
	
	 
	 @Column(name = "password")
	 
	 @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$",
     message = "La contraseña debe tener al menos 8 caracteres, una letra mayúscula, una letra minúscula, un dígito y un carácter especial")
     private String password;
	 
	 
	 @Column(name = "token")
	 private String token;
	 
	 @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	 private LocalDateTime created;
	 @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	 private LocalDateTime modified;
	 @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	 private LocalDateTime last_login;
	 
	 @Column(nullable=false, columnDefinition = "BOOLEAN DEFAULT FALSE")
	 private boolean isActive=true;
	 
	 
	 @OneToMany
	 private List<Phone> phones;
	 
	 
	 
    
	

}
