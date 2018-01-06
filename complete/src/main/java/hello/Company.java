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
@Table(name="Company")
public class Company implements Serializable {
	public Company() {
	}
	
	@Column(name="Id", nullable=false)	
	@Id	
	@GeneratedValue(generator="HELLO_COMPANY_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="HELLO_COMPANY_ID_GENERATOR", strategy="native")	
	private Long id;
	
	@Column(name="Name", nullable=false, length=255)	
	private String name;
	
	@Column(name="Address", nullable=true, length=255)	
	private String address;
	
	@OneToMany(mappedBy="company", targetEntity=hello.Person.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set person = new java.util.HashSet();
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAddress(String value) {
		this.address = value;
	}
	
	public String getAddress() {
		return address;
	}
	
	private void setId(long value) {
		setId(new Long(value));
	}
	
	private void setId(Long value) {
		this.id = value;
	}
	
	public Long getId() {
		return id;
	}
	
	public Long getORMID() {
		return getId();
	}
	
	public void setPerson(java.util.Set value) {
		this.person = value;
	}
	
	public java.util.Set getPerson() {
		return person;
	}
	
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
