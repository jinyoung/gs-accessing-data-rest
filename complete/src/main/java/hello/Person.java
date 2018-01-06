/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence clazz.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: uengine
 * License Type: Purchased
 */
package hello;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Person")
public class Person implements Serializable {
	public Person() {
	}
	
	@Column(name="id", nullable=false, length=255)	
	@Id	
	@GeneratedValue(generator="HELLO_PERSON_ID_GENERATOR", strategy=GenerationType.AUTO)	
	@org.hibernate.annotations.GenericGenerator(name="HELLO_PERSON_ID_GENERATOR", strategy="native")	
	private long id;
	
	@Column(name="firstName", nullable=true, length=255)	
	private String firstName;
	
	@Column(name="lastName", nullable=true, length=255)	
	private String lastName;
	
	@ManyToOne(targetEntity=hello.Company.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="CompanyId", referencedColumnName="Id", nullable=false) })	
	private hello.Company company;
	
	private void setId(long value) {
		this.id = value;
	}
	
	public long getId() {
		return id;
	}
	
	public long getORMID() {
		return getId();
	}
	
	public void setFirstName(String value) {
		this.firstName = value;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String value) {
		this.lastName = value;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setCompany(hello.Company value) {
		this.company = value;
	}
	
	public hello.Company getCompany() {
		return company;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
