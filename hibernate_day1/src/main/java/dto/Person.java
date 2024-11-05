package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Generated;

//data transfer object 

@Entity
public class Person {
	@Id
	
	private int personId;
	private String personName;

	private String personAddress;
	private int personAge;
	private long personPhone;
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonAddress() {
		return personAddress;
	}
	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public long getPersonPhone() {
		return personPhone;
	}
	public void setPersonPhone(long personPhone) {
		this.personPhone = personPhone;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personAddress=" + personAddress
				+ ", personAge=" + personAge + ", personPhone=" + personPhone + "]";
	}

}
