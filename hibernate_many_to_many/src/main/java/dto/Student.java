package dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	private String studentName;
	private int studentAge;
	private String studentAdd;
	private long studentPhone;
	@ManyToMany
	private List<Course> cources;
	public List<Course> getCources() {
		return cources;
	}
	public void setCources(List<Course> cources) {
		this.cources = cources;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", studentAdd=" + studentAdd + ", studentPhone=" + studentPhone + "]";
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentAdd() {
		return studentAdd;
	}
	public void setStudentAdd(String studentAdd) {
		this.studentAdd = studentAdd;
	}
	public long getStudentPhone() {
		return studentPhone;
	}
	public void setStudentPhone(long studentPhone) {
		this.studentPhone = studentPhone;
	}

}
