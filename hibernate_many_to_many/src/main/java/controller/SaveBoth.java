package controller;

import java.util.ArrayList;
import java.util.List;

import Dao.StudentDao;
import dto.Course;
import dto.Student;

public class SaveBoth {

	public static void main(String[] args) {
		Course course1= new Course();
		course1.setCourseName("java");
		course1.setCourseDuration(3);
		course1.setCourseFees(30000);
		
		Course course2= new Course();
		course2.setCourseName("java");
		course2.setCourseDuration(3);
		course2.setCourseFees(30000);
		
		Course course3= new Course();
		course3.setCourseName("java");
		course3.setCourseDuration(3);
		course3.setCourseFees(30000);
		
		Student student1= new Student();
		student1.setStudentName("Hussain");
		student1.setStudentAdd("Hyd");
		student1.setStudentAge(21);
		student1.setStudentPhone(9288377278L);
		
		Student student2= new Student();
		student2.setStudentName("Shayam");
		student2.setStudentAdd("Hyd");
		student2.setStudentAge(22);
		student2.setStudentPhone(9288377778L);
		
		Student student3= new Student();
		student3.setStudentName("Karim");
		student3.setStudentAdd("Hyd");
		student3.setStudentAge(23);
		student3.setStudentPhone(9289377278L);
		
		List<Course> platinum= new ArrayList<Course>();
		platinum.add(course1);
		platinum.add(course2);
		platinum.add(course3);
		
		List<Course> gold= new ArrayList<Course>();
		gold.add(course1);
		gold.add(course2);
		
		List<Course> silver= new ArrayList<Course>();
		silver.add(course1);
		silver.add(course3);
		
		student1.setCources(platinum);
		student2.setCources(gold);
        student3.setCources(silver);		
		StudentDao studentDao = new StudentDao();
		studentDao.saveBoth(student1);
		studentDao.saveBoth(student2);
        studentDao.saveBoth(student3);		
		

	}

}
