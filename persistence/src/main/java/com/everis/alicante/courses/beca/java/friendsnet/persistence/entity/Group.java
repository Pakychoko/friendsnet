/**
 * 
 */
package com.everis.alicante.courses.beca.java.friendsnet.persistence.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

/**
 * @author Pakychoko
 *
 */
@Entity(name = "GROUP_TABLE")
public class Group implements FNEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private byte[] picture;

	@ManyToMany(mappedBy = "groupsOf")
	private List<Person> personsOf;

}
