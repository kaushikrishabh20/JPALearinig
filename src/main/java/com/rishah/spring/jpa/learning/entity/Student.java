package com.rishah.spring.jpa.learning.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity  //this annotation is used to map the class to db
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(
		name = "tbl_student",
		uniqueConstraints = @UniqueConstraint(
				name = "emailid_unique",
				columnNames = "email_address"
				)
		)   		//this anotation is used to define the table properties
public class Student {
	
	@Id				//is used to declare a field as a primary key
	 @SequenceGenerator(
	            name = "student_sequence",
	            sequenceName = "student_sequence",
	            allocationSize = 1
	    )
	    @GeneratedValue(
	            strategy = GenerationType.SEQUENCE,
	            generator = "student_sequence"
	    )   //this is a custom sequence
	private long studentId;
	private String firstName;
	private String lastName;
	
	@Column(
			name="email_address",
			nullable = false
			)    //this anotation is used to define the column properties
	private String emailId;
	
	//moved to another embedded class
//	private String guardainName;
//	private String guardainEmail;
//	private String guardianMobile;
	
	public Student() {}
	
	@Embedded
	private Guardian gurdian;
	

	public Student(String firstName, String lastName, String emailId, Guardian gurdian) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.gurdian = gurdian;
	}

	
	

	//commented due to implementation of embeddedable
	/*
	 * public Student(long studentId,String firstName, String lastName, String
	 * emailId, String guardainName, String guardainEmail, String guardianMobile) {
	 * 
	 * this.studentId = studentId; this.firstName = firstName; this.lastName =
	 * lastName; this.emailId = emailId; this.guardainName = guardainName;
	 * this.guardainEmail = guardainEmail; this.guardianMobile = guardianMobile; }
	 * 
	 * public Student(String firstName, String lastName, String emailId, String
	 * guardainName, String guardainEmail, String guardianMobile) {
	 * 
	 * this.firstName = firstName; this.lastName = lastName; this.emailId = emailId;
	 * this.guardainName = guardainName; this.guardainEmail = guardainEmail;
	 * this.guardianMobile = guardianMobile; }
	 */
	
	

}
