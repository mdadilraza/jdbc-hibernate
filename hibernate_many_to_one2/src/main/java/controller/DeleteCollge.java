package controller;

import dao.CollegeDao;

public class DeleteCollge {

	public static void main(String[] args) {
		
		CollegeDao collegeDao= new CollegeDao();
		collegeDao.deleteCollege(1);

	}

}
