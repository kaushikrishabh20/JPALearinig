package com.rishah.spring.jpa.learning.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@AttributeOverrides({
	@AttributeOverride(
			name = "name",
			column = @Column(name = "gurdain_name")
			),
	@AttributeOverride(
			name = "email",
			column = @Column(name = "gurdain_email")
			),
	@AttributeOverride(
					name = "mobile",
					column = @Column(name = "gurdain_mobile")
					)
})
public class Guardian {

	String name;
	String email;
	String mobile;
	
	public Guardian() {}
	
	public Guardian(String name, String email, String mobile) {
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}
	
	
}
