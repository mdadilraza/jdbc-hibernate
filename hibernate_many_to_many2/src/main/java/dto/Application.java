package dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Application {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int applicationId;
	private String applicationName;
	private int applictionSize;
	private String applictionType;
	private double applicationRating;
	@ManyToMany
	private List<User> users;
	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public String getApplicationName() {
		return applicationName;
	}
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
	public int getApplictionSize() {
		return applictionSize;
	}
	public void setApplictionSize(int applictionSize) {
		this.applictionSize = applictionSize;
	}
	public String getApplictionType() {
		return applictionType;
	}
	public void setApplictionType(String applictionType) {
		this.applictionType = applictionType;
	}
	public double getApplicationRating() {
		return applicationRating;
	}
	public void setApplicationRating(double applicationRating) {
		this.applicationRating = applicationRating;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	@Override
	public String toString() {
		return "Application [applicationId=" + applicationId + ", applicationName=" + applicationName
				+ ", applictionSize=" + applictionSize + ", applictionType=" + applictionType + ", applicationRating="
				+ applicationRating + "]";
	}
	
	
	

}
