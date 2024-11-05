package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class University {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int universityId;
	private String universityName;
	private String universityAdd;
	private long universityPhone;
	
	private String universityWebsite;

	public int getUniversityId() {
		return universityId;
	}

	public void setUniversityId(int universityId) {
		this.universityId = universityId;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getUniversityAdd() {
		return universityAdd;
	}

	public void setUniversityAdd(String universityAdd) {
		this.universityAdd = universityAdd;
	}

	public long getUniversityPhone() {
		return universityPhone;
	}

	public void setUniversityPhone(long universityPhone) {
		this.universityPhone = universityPhone;
	}

	public String getUniversityWebsite() {
		return universityWebsite;
	}

	public void setUniversityWebsite(String universityWebsite) {
		this.universityWebsite = universityWebsite;
	}

	@Override
	public String toString() {
		return "University [universityId=" + universityId + ", universityName=" + universityName + ", universityAdd="
				+ universityAdd + ", universityPhone=" + universityPhone + ", universityWebsite=" + universityWebsite
				+ "]";
	}
	
	

}
