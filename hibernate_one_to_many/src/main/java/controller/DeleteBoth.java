package controller;

import dao.CollegeDao;

public class DeleteBoth {

	public static void main(String[] args) {
		CollegeDao collegeDao= new CollegeDao();
		collegeDao.deleteBoth(1);

	}

}
