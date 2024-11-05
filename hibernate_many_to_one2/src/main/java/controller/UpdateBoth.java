package controller;

import dao.CollegeDao;
import dto.College;
import dto.University;

public class UpdateBoth {

	public static void main(String[] args) {
		University university= new University();
		university.setUniversityName("MANU");
		university.setUniversityAdd("Hyd");
		university.setUniversityPhone(92828727272L);
		university.setUniversityWebsite("www.manu.com");
		university.setUniversityId(1);
		
		College college1= new  College();
		college1.setCollegeName("GNIT");
		college1.setCollegeAdd("HYD");
		college1.setCollegeEmail("gnit@gmail.com");
		college1.setUniversity(university);
		college1.setCollgeId(1);
		college1.setCollegePhone(9827827278L);
		
		College college2= new  College();
		college2.setCollegeName("ACE");
		college2.setCollegeAdd("HYD");
		college2.setCollegeEmail("ace@gmail.com");
		college2.setUniversity(university);
		college2.setCollgeId(2);
		college2.setCollegePhone(67272772727L);
		
		
		
		CollegeDao collegeDao= new CollegeDao();
		collegeDao.updateBoth(1, college1);
		collegeDao.updateBoth(2, college2);
		
		
				
		

	}

}
