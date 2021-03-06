package com.basaki.example.docker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * {@code Book} represents an author.
 * <p/>
 *
 * @author Indra Basak
 * @since 3/13/17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    private String firstName;

    private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
    
    
}
