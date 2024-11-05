package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int collgeId;
	private String collegeName;
	private String collegeAdd;
	private long collegePhone;
	private String collegeEmail;
	@ManyToOne
	University university;

	public int getCollgeId() {
		return collgeId;
	}

	public void setCollgeId(int collgeId) {
		this.collgeId = collgeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCollegeAdd() {
		return collegeAdd;
	}

	public void setCollegeAdd(String collegeAdd) {
		this.collegeAdd = collegeAdd;
	}

	public long getCollegePhone() {
		return collegePhone;
	}

	public void setCollegePhone(long collegePhone) {
		this.collegePhone = collegePhone;
	}

	public String getCollegeEmail() {
		return collegeEmail;
	}

	public void setCollegeEmail(String collegeEmail) {
		this.collegeEmail = collegeEmail;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	@Override
	public String toString() {
		return "College [collgeId=" + collgeId + ", collegeName=" + collegeName + ", collegeAdd=" + collegeAdd
				+ ", collegePhone=" + collegePhone + ", collegeEmail=" + collegeEmail + ", university=" + university
				+ "]";
	}

}
