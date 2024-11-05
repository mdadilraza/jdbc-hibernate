package controller;

import dao.CollegeDao;
import dto.College;
import dto.University;

public class SaveBoth {

	public static void main(String[] args) {
		University university= new University();
		university.setUniversityName("JNTU");
		university.setUniversityAdd("Kukatpally");
		university.setUniversityPhone(9973283636L);
		university.setUniversityWebsite("www.jntuh.com");
		
		College college1= new College();
		college1.setCollegeName("HITS");
		college1.setCollegeAdd("Ghatkesar");
		college1.setCollegeEmail("hits@gmail.com");
		college1.setCollegePhone(7625265263L);
		college1.setUniversity(university);
		
		College college2= new College();
		college2.setCollegeName("VIGNAN");
		college2.setCollegeAdd("Ghatkesar");
		college2.setCollegeEmail("vignan@gmail.com");
		college2.setCollegePhone(7625265263L);
		college2.setUniversity(university);
		
		College college3= new College();
		college3.setCollegeName("ACE");
		college3.setCollegeAdd("Ghatkesar");
		college3.setCollegeEmail("ace@gmail.com");
		college3.setCollegePhone(7625265263L);
		college3.setUniversity(university);
		
		CollegeDao collegeDao= new  CollegeDao();
		collegeDao.saveBoth(college1);
		collegeDao.saveBoth(college2);
		collegeDao.saveBoth(college3);
		
				
		

	}

}
