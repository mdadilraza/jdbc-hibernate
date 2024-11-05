package controller;

import java.util.ArrayList;

import java.util.List;

import dao.CollegeDao;
import dto.College;
import dto.Student;

public class SaveBoth {
	public static void main(String[] args) {
		College college = new College();
		college.setCollegeName("HITS");
		college.setCollegeAdd("Ghatkesar");
		college.setCollegePhone(9973293480L);
		college.setEmail("hits@gmail.com");

		Student student = new Student();
		student.setStudentName("Rahul");
		student.setStudentBranch("CSE");
		student.setStudentAdd("Nepal");
		student.setStudentPhone(8235190424L);
		student.setStdudentGender("Male");

		Student student1 = new Student();

		student1.setStudentName("Kashif");
		student1.setStudentBranch("CSE");
		student1.setStudentAdd("Hyd");
		student1.setStudentPhone(8235190424L);
		student1.setStdudentGender("Male");

		Student student2 = new Student();
		student2.setStudentPhone(8235190424L);
		student2.setStdudentGender("Male");
		student2.setStudentName("Karim");
		student2.setStudentBranch("CE");
		student2.setStudentAdd("Nepal");

		List<Student> list = new ArrayList<Student>();
		list.add(student);
		list.add(student1);
		list.add(student2);

		college.setStudent(list);

		CollegeDao collegeDao = new CollegeDao();
		collegeDao.saveBoth(college);

	}
	
	

}
