package com.everis.alicante.courses.beca.java.friendsnet.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Objeto de entrada/salida de grupos
 * @author Pakychoko
 *
 */
@Getter @Setter
public class GroupDTO {

	private Long id;
	
	private String name;
	
	private byte[] picture;
   
    private List<PersonDTO> personsOf;
}
