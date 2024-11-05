package controller;

import dao.CollegeDao;

public class FetchById {

	public static void main(String[] args) {
		CollegeDao collegeDao= new CollegeDao();
		collegeDao.fetchById(1);

	}

}
