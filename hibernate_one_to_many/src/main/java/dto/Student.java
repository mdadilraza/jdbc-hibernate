package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	private String studentName;
	private String   studentBranch;
	private long studentPhone;
	private String studentAdd;
	private String stdudentGender;
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
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentBranch=" + studentBranch
				+ ", studentPhone=" + studentPhone + ", studentAdd=" + studentAdd + ", stdudentGender=" + stdudentGender
				+ "]";
	}
	public String getStudentBranch() {
		return studentBranch;
	}
	public void setStudentBranch(String studentBranch) {
		this.studentBranch = studentBranch;
	}
	public long getStudentPhone() {
		return studentPhone;
	}
	public void setStudentPhone(long studentPhone) {
		this.studentPhone = studentPhone;
	}
	public String getStudentAdd() {
		return studentAdd;
	}
	public void setStudentAdd(String studentAdd) {
		this.studentAdd = studentAdd;
	}
	public String getStdudentGender() {
		return stdudentGender;
	}
	public void setStdudentGender(String stdudentGender) {
		this.stdudentGender = stdudentGender;
	}
	

}
