package dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int collegeId;
	 private String collegeName;
	 private String collegeAdd;
	 private long collegePhone;
	 @OneToMany
	 private List<Student> student;
	 
	 public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	private String email;

	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", collegeAdd=" + collegeAdd
				+ ", collegePhone=" + collegePhone + ", email=" + email + "]";
	}
	 

}
