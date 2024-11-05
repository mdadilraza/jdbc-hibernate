package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int courseId;
	private String courseName;
	private double courseFees;
	private int courseDuration;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courceId) {
		this.courseId = courceId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courceName) {
		this.courseName = courceName;
	}
	public double getCourseFees() {
		return courseFees;
	}
	public void setCourseFees(double courceFees) {
		this.courseFees = courceFees;
	}
	public int getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(int courceDuration) {
		this.courseDuration = courceDuration;
	}
	@Override
	public String toString() {
		return "Cource [courceId=" + courseId + ", courceName=" + courseName + ", courceFees=" + courseFees
				+ ", courceDuration=" + courseDuration + "]";
	}
	

}
