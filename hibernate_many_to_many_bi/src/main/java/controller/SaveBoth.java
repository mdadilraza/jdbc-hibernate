package controller;

import java.util.ArrayList;
import java.util.List;

import dao.CourseDao;
import dto.Course;
import dto.Student;

public class SaveBoth {

	public static void main(String[] args) {
		Course course1= new Course();
		course1.setCourseName("java");
		course1.setCourseFees(350000);
		course1.setCourseDuration(3);
		
		
		Course course2= new Course();
		course2.setCourseName("SQL");
		course2.setCourseFees(250000);
		course2.setCourseDuration(1);
		
		Course course3= new Course();
		course3.setCourseName("Adv java");
		course3.setCourseFees(450000);
		course3.setCourseDuration(3);
		
		Student student1= new Student();
		student1.setStudentName("Karim");
		student1.setStudentAddress("Hyd");
		student1.setStudentAge(23);
		
		Student student2= new Student();
		student2.setStudentName("Karim");
		student2.setStudentAddress("Hyd");
		student2.setStudentAge(23);
		
		Student student3= new Student();
		student3.setStudentName("Karim");
		student3.setStudentAddress("Hyd");
		student3.setStudentAge(23);
		
		List<Student> students= new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		course1.setStudents(students);
		course2.setStudents(students);
		course3.setStudents(students);
		
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
		
		student1.setCourses(platinum);
		student1.setCourses(gold);
		student1.setCourses(silver);
		
		CourseDao courseDao= new CourseDao();
		courseDao.saveBoth(students);
//		courseDao.saveBoth(student2);
//		courseDao.saveBoth(student3);
		
		

	}

}
